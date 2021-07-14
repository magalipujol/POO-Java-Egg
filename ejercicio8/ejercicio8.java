package ejercicio8;


public class ejercicio8 {
    public static void main(String[] args) {
        
        CadenaControl cadenaControl = new CadenaControl();

        Cadena cadena = cadenaControl.crearCadena();

        System.out.println(cadena.toString());

        System.out.println("La frase tiene " + cadenaControl.mostrarVocales(cadena) + " vocales.");

        System.out.println("La frase invertida es: " + cadenaControl.invertirFrase(cadena));

        System.out.println("La letra aparece " + cadenaControl.vecesRepetido(cadena) + " veces");

        System.out.println("Es " + cadenaControl.compararLongitud(cadena) + " que las cadenas tienen la misma longitud");

        System.out.println("Las frases unidas son " + cadenaControl.unirFrases(cadena));

        System.out.println("La frase reemplazada queda " + cadenaControl.reemplazar(cadena));

        System.out.println("Es " +  cadenaControl.contiene(cadena) + " que la frase contiene el caracter");

    }
}







