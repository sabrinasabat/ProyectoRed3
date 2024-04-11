package red.main;


import red.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // incluyendo aparatos en la clase Aparato
        Aparato tele = new Aparato("Tele", 35);
        Aparato radio = new Aparato("Radio", 30);
        Aparato xbox = new Aparato("Xbox", 125);
        Aparato termoElectrico = new Aparato("Termo Eléctrico", 220);
        Aparato ordenador = new Aparato("ordenador", 79);

        // encendiendo todos los aparatos
        tele.encender();
        radio.encender();
        xbox.encender();
        termoElectrico.encender();
        ordenador.encender();

        // he creado la red y puse la potencia que tiene esta red
        Red miRed = new Red(400);

        // adicionando los aparatos a la red
        miRed.addAparato(tele);
        miRed.addAparato(radio);
        miRed.addAparato(xbox);
        miRed.addAparato(termoElectrico);
        miRed.addAparato(ordenador);


        SistemaSeguridad miSistemaSeguridad = new SistemaSeguridadBasico(miRed) {
            @Override
            public List<Aparato> getAparatos() {
                return new ArrayList<>(red.getAparatos());
            }
        };


        miSistemaSeguridad.actua();

        System.out.println("es la red estable? " + (miRed.esEstable()) );

        System.out.println("estado final de la red : " + miRed);









































    }


}



