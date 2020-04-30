package ar.edu.unahur.obj2.clases;

// Si es administrativo: sueldoBase \* ((hsExtra \* 1.5)+hsMes) / hsMes

public class Administrativo  extends Empleado{
    private float hsExtra;
    private float hsMes;

    public Administrativo(int dni, String nombre, String apellido, float sueldoBase,float hsExtra, float hsMes) {
        super(dni, nombre, apellido, sueldoBase);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

    public float getHsExtra() {
        return hsExtra;
    }

    public float getHsMes() { return hsMes; }

    @Override
    public float getSueldo() {
        sueldo +=((hsExtra * 1.5)+hsMes) / hsMes;
        return sueldo;
    }


}
