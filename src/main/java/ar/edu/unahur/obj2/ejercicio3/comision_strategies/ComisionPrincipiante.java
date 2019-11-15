package ar.edu.unahur.obj2.ejercicio3.comision_strategies;

public class ComisionPrincipiante implements Comision {

  @Override
  public String getRango() {
    return "PRINCIPIANTE";
  }

  @Override
  public double getComision() {
    return 0.10;
  }
}
