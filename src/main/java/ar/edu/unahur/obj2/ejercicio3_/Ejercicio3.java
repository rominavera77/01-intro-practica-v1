package ar.edu.unahur.obj2.ejercicio3_;

//Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y
// almacénalas en un array.
//
//Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        double[] temperaturas =leerTemperaruras();
        mostrarEnPantallaElGrafico(temperaturas);

    }

    public static void mostrarEnPantalla(String mensaje) { System.out.print(mensaje);}

    public static double leerTemperaturasDeTeclado() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextDouble();
    }
    public static double[] leerTemperaruras() {
        double[] lista = new double[24];
        mostrarEnPantalla("Ingrese las temperaturas cada hora:");
        for(int i=0;i<24;i++){
            lista[i] = leerTemperaturasDeTeclado();
        }
        return lista;
    }

    public static double calcularLaMedia(double[] lista) {
       double suma = 0;
       for(int i=0;i<lista.length;i++) {
           suma = suma + lista[i];
       }
       return suma/24;
    }

    public static double calcularLaMaxima(double[] lista) {
        double maximo = 0;
        for(int i=0; i<lista.length; i++) {
            if (lista[i] >maximo){
                maximo = lista[i];
            }
        }
        return maximo;
    }

    public static double calcularLaMinima(double[] lista) {
        double minimo = 0;
        for(int i=0; i<lista.length; i++) {
            if(lista[i] < minimo){
                minimo = lista[i];
            }
        }
        return minimo;
    }


    public static void mostrarEnPantallaElGrafico(double[] lista) {
        for(int i = 0; i < lista.length; i++) {
            double actual = lista[i];

            //Imprime la hora
            System.out.print(i);

            // Imprime el gráfico
            for (int j = 0; j < (int)actual; j++){
                System.out.print("*");
            }
            if (actual == calcularLaMaxima(lista)) {
                mostrarEnPantalla("--> Maxima");
            } else if (actual == calcularLaMinima(lista)) {
                mostrarEnPantalla("--> Minima");
            } else {
                System.out.println(actual);
            }
            mostrarEnPantalla("Media: " + calcularLaMedia(lista));
        }
    }


}


