package red.dominio;

import java.util.List;

public abstract class SistemaSeguridad {

    protected Red red; // cuando tiene herencia se hace protect

    public SistemaSeguridad (Red red) {

        this.red = red;
    }

    public boolean actua() {
        System.out.println("empezando actuación sistema seguridad");

        for (Aparato aparato: getAparatos()) {
            if (red.esEstable()) {
                System.out.println("equilibrio alcanzado : salimos");
                break;
            }
            System.out.println("apagamos : " + aparato);
            aparato.apagar();
        }
        return red.esEstable();
    }

    protected abstract List<Aparato> getAparatos(); // será heredado por las hijas, por eso es protect
}