package ar.edu.unahur.obj2.clases;
 //Si es vendedor: sueldoBase + (porcenComision\*totalVtas/100)

public class Vendedor {
    private float porcentajeComision;
    private float totalVentas;

    public Vendedor(float porcentajeComision, float totalVentas) {
        super();
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public float getSueldo() {
        return getSueldo() + (porcentajeComision * totalVentas)/100;
    }
}
