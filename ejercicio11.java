import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ejercicio11 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese el año");
        int anio = leer.nextInt() - 1900;

        Date fechaUsuario = new Date(anio, mes, dia);
        Date fechaActual = new Date();

        System.out.println(fechaUsuario);
        System.out.println(fechaActual);

        int añosDeDiferencia = fechaActual.getYear() - fechaUsuario.getYear();
        System.out.println("Hay " + añosDeDiferencia + " años de diferencia entre las fechas");

        



    }
}
