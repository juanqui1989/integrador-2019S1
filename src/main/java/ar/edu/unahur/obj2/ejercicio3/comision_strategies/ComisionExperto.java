package ar.edu.unahur.obj2.ejercicio3.comision_strategies;

public class ComisionExperto implements Comision {
  @Override
  public String getRango() {
    return "EXPERTO";
  }

  @Override
  public double getComision() {
    return 0.40;
  }
}
