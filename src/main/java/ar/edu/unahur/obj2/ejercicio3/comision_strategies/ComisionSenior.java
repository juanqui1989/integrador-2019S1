package ar.edu.unahur.obj2.ejercicio3.comision_strategies;

public class ComisionSenior implements Comision {
  @Override
  public String getRango() {
    return "SENIOR";
  }

  @Override
  public double getComision() {
    return 0.20;
  }
}
