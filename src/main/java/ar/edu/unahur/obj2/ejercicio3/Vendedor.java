package ar.edu.unahur.obj2.ejercicio3;

import ar.edu.unahur.obj2.ejercicio3.comision_strategies.Comision;

public class Vendedor {

    private String tipoVendedor;
    private Comision comision;

    public Vendedor(Comision comision) {
        this.tipoVendedor = comision.getRango();
        this.comision = comision;
    }

    public double comision(double montoVenta) {

        return montoVenta * comision.getComision();
    }

    public String getTipoVendedor() {
        return tipoVendedor;
    }


    public Comision getComision() {
        return comision;
    }

    public void setComision(Comision comision) {
        this.comision = comision;
        this.tipoVendedor = comision.getRango();
    }
}
