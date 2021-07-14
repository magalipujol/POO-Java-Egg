package ejercicio7;
import java.util.Scanner;

public class PersonaControl {
    
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese la altura");
        persona.setAltura(leer.nextDouble());
        System.out.println("Ingrese el peso");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese el sexo");
        Boolean sexoCorrecto = false;
        do {
            String sexo = leer.next();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o") || sexo.equalsIgnoreCase("h")){
                persona.setSexo(sexo);
                sexoCorrecto = true;
            } else {
                System.out.println("El sexo no existe");
            }
        } while (sexoCorrecto == false);

        return persona;
    }

    public int calcularIMC(Persona persona) {
        double IMC = persona.getPeso()/(Math.pow(persona.getAltura(), 2));
        int resultado;
        if (IMC < 20) {
            resultado = -1;
        } else if (IMC <= 25 && IMC >= 20) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(Persona persona) {
        boolean esMayorDeEdad = false;
        if (persona.getEdad() >= 18) {
            esMayorDeEdad = true;
        } 
        return esMayorDeEdad;
    }
}
