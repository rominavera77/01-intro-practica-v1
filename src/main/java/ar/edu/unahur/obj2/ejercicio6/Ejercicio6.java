package ar.edu.unahur.obj2.ejercicio6;

//Crea una matriz de 3x3 elementos pidiendo los valores al usuario.
// Después, muestra el contenido de la matriz por pantalla.
//Para facilitar la visualización es recomendable usar la función [`System.out.format()`]
// (https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)

import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int[] matriz = leerElementosDeLaMatriz();
        mostrarLaMatriz(matriz);
    }

    public static void mostrarEnPantalla(String mensaje) { System.out.print(mensaje);}

    public static int leerNumerosDeTeclado() {
        Scanner matriz = new Scanner(System.in);
        return matriz.nextInt();
    }

    public static int[]  leerElementosDeLaMatriz() {
       int[] lista= new int[9];
        mostrarEnPantalla("Ingrese los numeros de la matriz 3x3: ");
       for(int i=0; i<9; i++) {
          lista [i] = leerNumerosDeTeclado();
       }
       return lista;
    }

    public static void mostrarLaMatriz(int[] lista) {
        mostrarEnPantalla("La matriz es: ");
        for(int i=0; i<9; i++)
            for (int j = 0; j < 9; j++) {
                System.out.format("%01d", lista);
            }
    }


}
