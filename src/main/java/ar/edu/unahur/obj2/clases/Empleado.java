package ar.edu.unahur.obj2.clases;
//Cargar una lista de empleados (máximo 20) preguntado en cada uno si son administrativos
// o vendedores y cargar todos los datos respectivos.
//
//Luego listar los empleados indicando: dni, nombre, apellido y sueldo.
//El sueldo debe calcularse en el método getSueldo() de la siguiente forma:
//* Si es administrativo: sueldoBase \* ((hsExtra \* 1.5)+hsMes) / hsMes
//* Si es vendedor: sueldoBase + (porcenComision\*totalVtas/100)
//
//Usar un List de tipo empleado para resolver este ejercicio.

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private float sueldoBase;

    public Empleado(int dni, String nombre, String apellido, float sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
    }

    public float getSueldo() {
        return 0;
    }


}
