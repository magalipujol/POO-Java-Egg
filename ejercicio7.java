public class ejercicio7 {
    public static void main(String[] args) {

        PersonaControl personaControl = new PersonaControl();

        Persona[] vectorPersonas = new Persona[4];
        int[] vectorIMC = new int[4];
        boolean[] vectorEdad = new boolean[4];

        int i;
        for (i = 0; i < 4; i++) {
            vectorPersonas[i] = personaControl.crearPersona();
            vectorEdad[i] = personaControl.esMayorDeEdad(vectorPersonas[i]);
            vectorIMC[i] = personaControl.calcularIMC(vectorPersonas[i]);
        }


        double IMCBajo = 0.0, IMCNormal = 0.0, IMCAlto = 0.0, mayoresDeEdad = 0.0;

        for (i = 0; i < vectorEdad.length; i++) {
            if (vectorEdad[i]) {
                mayoresDeEdad += 1;
            }
        }

        for (i = 0; i < vectorIMC.length; i++) {
            if (vectorIMC[i] == -1) {
                IMCBajo += 1;
            } else if (vectorIMC[i] == 0) {
                IMCNormal += 1;
            } else {
                IMCAlto += 1;
            }
        }

        double porcentajeMayorDeEdad = mayoresDeEdad / vectorPersonas.length * 100;
        double porcentajeIMCbajo = IMCBajo / vectorPersonas.length * 100;
        double porcentajeIMCNormal = IMCNormal / vectorPersonas.length * 100; 
        double porcentajeIMCAlto = IMCAlto / vectorPersonas.length * 100; 

        System.out.println("El " + porcentajeMayorDeEdad + "% es mayor de edad.");
        System.out.println("El " + porcentajeIMCbajo + "% tiene un IMC por debajo del normal");
        System.out.println("El " + porcentajeIMCNormal + "% tiene un IMC normal");
        System.out.println("El " + porcentajeIMCAlto + "% tiene un IMC por encima del normal");

    }
}
