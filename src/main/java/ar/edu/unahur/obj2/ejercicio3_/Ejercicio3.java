package ar.edu.unahur.obj2.ejercicio3_;

//Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y
// almacénalas en un array.
//
//Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.

import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        float[] temperaturas =leerTemperaruras();
        float maxima = calcularLaMaxima(temperaturas);
        float minima = calcularLaMinima(temperaturas) ;
        float media = calcularLaMedia(temperaturas);
        mostrarEnPantallaElGrafico(temperaturas);

    }

    public static void mostrarEnPantalla(String mensaje) { System.out.print(mensaje);}

    public static float leerTemperaturasDeTeclado() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    public static float[] leerTemperaruras() {
        float[] lista = new float[24];
        mostrarEnPantalla("Ingrese las temperaturas cada hora:");
        for(int i=0;i<24;i++){
            lista[i] = leerTemperaturasDeTeclado();
        }
        return lista;
    }

    public static float calcularLaMedia(float[] lista) {
       float suma = 0;
       for(int i=0;i<lista.length;i++) {
           suma = suma + lista.get(i);
       }
       return suma/24;
    }

    public static float calcularLaMaxima(float[] lista) {
        float maximo = 0;
        for(int i=0; i<lista.length; i++) {
            if(lista[i] > maximo){
                maximo = lista[i];
            }
        }
        return maximo;
    }

    public static float calcularLaMinima(float[] lista) {
        float minimo = 0;
        for(int i=0; i<lista.length; i++) {
            if(lista[i] < minimo){
                minimo = lista[i];
            }
        }
        return minimo;
    }

    public static void mostrarEnPantallaElGrafico(float[] lista) {
        for(int i=0; i<lista.size(); i++) {
            System.out.print(i +"*");
        }
        mostrarEnPantalla("Media: "+media);
    }



}


