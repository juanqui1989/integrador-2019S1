package ar.edu.unahur.obj2.ejercicio3;

import ar.edu.unahur.obj2.ejercicio3.comision_strategies.ComisionExperto;
import ar.edu.unahur.obj2.ejercicio3.comision_strategies.ComisionPrincipiante;
import ar.edu.unahur.obj2.ejercicio3.comision_strategies.ComisionSenior;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VendedorTest {

    private Vendedor principiante;
    private Vendedor senior;
    private Vendedor experto;


    @BeforeMethod
    public void setUp() {
        principiante = new Vendedor(new ComisionPrincipiante());
        senior = new Vendedor(new ComisionSenior());
        experto = new Vendedor(new ComisionExperto());
    }

    @Test
    public void testComisionPrincipiante() {
        assertEquals(principiante.comision(100), 10.0);
    }

    @Test
    public void testComisionSenior() {
        assertEquals(senior.comision(100), 20.0);
    }

    @Test
    public void testComisionExperto() {
        assertEquals(experto.comision(100), 40.0);
    }
}