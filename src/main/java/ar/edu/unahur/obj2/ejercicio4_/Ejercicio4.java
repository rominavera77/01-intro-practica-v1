package ar.edu.unahur.obj2.ejercicio4_;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.
//
//Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.
//
//> Nota: El programa termina cuando se escriba `FIN` como búsqueda.

public class Ejercicio4 {

    public static void mostrarEnPantalla(String mensaje) {
        System.out.print(mensaje);
    }

    public static int leerCantidadDeAlumnosTeclado() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static int ingresarLaCantidadDeAlumnnos() {
        mostrarEnPantalla("Escriba el número de alumnos: ");
        return leerCantidadDeAlumnosTeclado();
    }

    public static String[] leerNombreYApellidoDeTeclado() {
        Scanner nombre = new Scanner(System.in);
        for(int i=0; i<ingresarLaCantidadDeAlumnnos(); i++) {
            nombre.nextInt();
        }
        return new String[]{nombre.next()};
    }

    public static String pedirUnaLetra(String letra) {
        mostrarEnPantalla("Ingrese una letra para buscar los nombres: ");
        return letra;
    }

    public static String  leerLetraDeTeclado() {
        Scanner letra = new Scanner(System.in);
        return  letra.nextLine();
    }

    public static List<String> filtrarNombres(String[] arreglo,String letra) {
        List <String> filtrados = new LinkedList<>();
        for(int i=0; i<arreglo.length; i++) {
            if (letra.charAt(0) == arreglo[i].charAt(0)) {
                filtrados.add(arreglo[i]);
            }
        }
        return filtrados;
    }

    public static void mostrarLosNombres(List<String> lista ) {
        mostrarEnPantalla("Los nombres son /n");
        for(int i=0;i < lista.size();i++) {
           mostrarEnPantalla(lista.get(i)+"/n");
        }
    }

    public static void main(String[] args) {
        int cantidadDeAlumnos = ingresarLaCantidadDeAlumnnos();
        String[] personas = leerNombreYApellidoDeTeclado();
        String letra = leerLetraDeTeclado();
        List<String> nombresFiltrados = filtrarNombres(leerNombreYApellidoDeTeclado(), letra);
        mostrarLosNombres(nombresFiltrados);
    }

}
