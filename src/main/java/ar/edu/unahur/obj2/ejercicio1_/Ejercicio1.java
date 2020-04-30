package ar.edu.unahur.obj2.ejercicio1_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Leer 10 datos numéricos y mostrarlos en orden inverso
        int[] listaAInvertir = leerListaAInvertir();
        List<Integer> listaInvertida = InvertirListaIngresada(listaAInvertir);
        mostrarEnPantallaElArreglo(listaInvertida);
    }

    public static void mostrarEnPantalla(String mensaje) {
        System.out.print(mensaje);
    }

    public static int leerNumeroDeTeclado() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static int[] leerListaAInvertir() {
        int[] lista = new int[10];
        mostrarEnPantalla("Ingrese 10 numeros: ");
        for (int i=0; i<10; i++){
            lista[i] = leerNumeroDeTeclado();
        }
        return lista;
    }

    public static List<Integer> InvertirListaIngresada(int[] arreglo) {
        List<Integer> listaInvertida= new LinkedList<>();
        for (int i=9; i>arreglo.length; i--) {
            listaInvertida.add(arreglo[i]);
        }
        return listaInvertida;
    }
    public static void mostrarEnPantallaElArreglo(List<Integer> lista) {
        mostrarEnPantalla("[");
        for (int i=0;i<lista.size()-1;i++){
            mostrarEnPantalla(lista.get(i)+",");
        }
        mostrarEnPantalla(lista.get(lista.size()-1)+"]");
    }
}




