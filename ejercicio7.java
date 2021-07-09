public class ejercicio7 {
    public static void main(String[] args) {
    
        PersonaControl personaControl = new PersonaControl();

        Persona[] vectorPersonas = new Persona[2];
        int[] vectorIMC = new int[2];
        boolean[] vectorEdad = new boolean[2];

        int i;
        for (i = 0; i < 2 ;  i++) {
            vectorPersonas[i] = personaControl.crearPersona();
            vectorEdad[i] = personaControl.esMayorDeEdad(vectorPersonas[i]);
            vectorIMC[i] = personaControl.calcularIMC(vectorPersonas[i]); 
        }

        // System.out.print(vectorPersonas[0]);
        // System.out.print(vectorPersonas[1]);

        int contadorIMCBajo = 0, IMCNormal = 0, IMCAlto = 0; 
    }
}
