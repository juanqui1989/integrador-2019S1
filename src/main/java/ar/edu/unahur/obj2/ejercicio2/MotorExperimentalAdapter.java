package ar.edu.unahur.obj2.ejercicio2;

public class MotorExperimentalAdapter implements Motor {

  private MotorExperimental motorExperimental;

  public MotorExperimentalAdapter(MotorExperimental motorExperimental) {
    this.motorExperimental = motorExperimental;
  }

  @Override
  public boolean encendido() {
    return motorExperimental.encendido();
  }

  @Override
  public long rpm() {
    return motorExperimental.rpm();
  }

  @Override
  public void encender() {
    motorExperimental.encender();
  }

  @Override
  public void apagar() {
    motorExperimental.apagar();
  }

  @Override
  public void acelerar(long i) {
    motorExperimental.apagar();
  }

  @Override
  public void frenar(long l) {
    motorExperimental.frenar(l);
  }
}
