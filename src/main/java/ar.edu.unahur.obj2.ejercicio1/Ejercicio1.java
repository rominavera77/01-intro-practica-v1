package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio1 {
    public int[] ordenar() {
        int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] respuesta = new int[10];
        int aux = 0;
        for (int i = numero.length - 1; i >=0 ; i --) {
            respuesta[aux] = numero[i];
            aux =aux+1;
        }
        return respuesta;
    }

    public void ejecutar(){
        this.imprimir(this.ordenar());
    }
    public void imprimir(int[] resp) {
        for (int i = 0; i< resp.length; i++) {
            System.out.println(resp[i]);
        }
    }
}
    //public int[] ordenar() {
       // return new int[] {};
    }
}
