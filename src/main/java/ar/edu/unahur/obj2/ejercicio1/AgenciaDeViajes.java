package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class AgenciaDeViajes {

    private List<Itinerable> paquetes;

    private PaqueteCuyo paqueteCuyo;
    private PaqueteNOA paqueteNOA;
    private PaquetePatagonia paquetePatagonia;

    public AgenciaDeViajes(PaqueteCuyo paqueteCuyo, PaqueteNOA paqueteNOA, PaquetePatagonia paquetePatagonia) {
        this.paqueteCuyo = paqueteCuyo;
        this.paqueteNOA = paqueteNOA;
        this.paquetePatagonia = paquetePatagonia;
        paquetes = new ArrayList<>();
        cargarPaquetes();
    }

    private void cargarPaquetes() {
        paquetes.add(this.paqueteCuyo);
        paquetes.add(this.paqueteNOA);
        paquetes.add(this.paquetePatagonia);
    }

    public void catalogoDePaquetes() {
        paquetes.stream()
                .forEach(Itinerable::imprimirItinerario );
    }

    public static void main(String[] args) {
        AgenciaDeViajes agencia = new AgenciaDeViajes(new PaqueteCuyo(), new PaqueteNOA(), new PaquetePatagonia());
        agencia.catalogoDePaquetes();

    }


}
