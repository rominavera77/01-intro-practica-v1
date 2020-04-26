package ar.edu.unahur.obj2.ejercicio2_;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void mostrarEnPantalla(String mensaje) { System.out.print(mensaje);}

    public static int leerNumeroDeTeclado() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static int leerNumeroDeBase() {
        mostrarEnPantalla("Escriba el número para comparar: ");
        return leerNumeroDeTeclado();
    }

    public static int[] leerNumerosAComparar() {
        int[] lista = new int[20];
        mostrarEnPantalla("Escriba 20 numeros contra los cuales comparar la base: ");
        for(int i=0;i<20;i++) {
            lista[i] = leerNumeroDeTeclado();
        }
        return lista;
    }

    public static void mostrarEnPantallaElArreglo(List<Integer> lista) {
        mostrarEnPantalla("Los mayores son: [");
        for(int i=0;i<lista.size()-1;i++) {
            mostrarEnPantalla(lista.get(i)+", ");
        }
        mostrarEnPantalla(lista.get(lista.size()-1)+"]");
    }

    public static List<Integer> filtrarElementosDelArreglo(int[] arreglo, int tope) {
        List<Integer> filtrados = new LinkedList<>();
        for(int i=0;i<arreglo.length;i++) {
            if (arreglo[i] > tope) {
                filtrados.add(arreglo[i]);
            }
        }
        return filtrados;
    }

    public static void main(String[] args) {
        int tope = leerNumeroDeBase();
        int[] numerosAComparar = leerNumerosAComparar();
        List<Integer> numerosFiltrados = filtrarElementosDelArreglo(numerosAComparar, tope);
        mostrarEnPantallaElArreglo(numerosFiltrados);
    }

}
