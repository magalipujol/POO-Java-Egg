package ejercicio12;

public class ejercicio12 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.crearPersona();

        System.out.println(persona.getName());
        System.out.println(persona.getBirthday());
        // TODO esto no anda
        System.out.println(persona.toString());
        System.out.println(persona.calcularEdad());
        System.out.println(persona.menorQue(50));
        persona.mostrarPersona();

    }
}
