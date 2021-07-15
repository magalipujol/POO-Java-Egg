package extra5;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Meses {
    private String[] meses;


    public Meses() {
    }

    public Meses(String[] meses) {
        this.meses = meses;
    }

    public String[] getMeses() {
        return this.meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "{" +
            " meses='" + getMeses() + "'" +
            "}";
    }
    
    Scanner leer = new Scanner(System.in);
    
    public void adivinarMes(String mesSecreto) {
        System.out.println("Ingrese un mes");
        String guess = leer.nextLine();
        if (mesSecreto.equalsIgnoreCase(guess)) {
            System.out.println("Correcto!");
        } else {
            System.out.println("nope :(");
            adivinarMes(mesSecreto);
        }
    }

}
