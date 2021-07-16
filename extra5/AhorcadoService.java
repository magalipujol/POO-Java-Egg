package extra5;

import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    public void crearJuego(Ahorcado ahorcado) {
        System.out.println("Ingresa una palabra");
        String palabraString = leer.nextLine();
        String[]  palabraArray = new String[palabraString.length()];
        for (int i = 0; i < palabraString.length(); i++) {
            palabraArray[i] = palabraString.substring(i, i + 1);
        }
        ahorcado.setPalabra(palabraArray);

        System.out.println("Ingresa la ctdad de intentos");
        ahorcado.setIntentos(leer.nextInt());
    }
    
    public int longitud(Ahorcado ahorcado) {
        return ahorcado.getPalabra().length;
    }
    
    public int buscar(String letra, Ahorcado ahorcado) {
        int contador = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i].equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean encontradas(String letra, Ahorcado ahorcado) {
        if (buscar(letra, ahorcado) == 0) {
            ahorcado.setIntentos(ahorcado.getIntentos() - 1);
            return false;
        } else {
            ahorcado.setCantidadLetrasEncontradas(ahorcado.getCantidadLetrasEncontradas() 
                                                  + buscar(letra, ahorcado));
            return true;
        }
    }

    public int intentos(Ahorcado ahorcado) {
        return ahorcado.getIntentos();
    }

    public void juego(Ahorcado ahorcado) {
        if (ahorcado.getCantidadLetrasEncontradas() == ahorcado.getPalabra().length) {
            System.out.println("yay ganaste");
        } else if (ahorcado.getIntentos() == 0) {
            System.out.println("te quedaste sin intentos :(");
        } else {
            System.out.println("Ingrese una letra para buscar");
            String letra = leer.next();
            buscar(letra, ahorcado);
            encontradas(letra, ahorcado);
            intentos(ahorcado);
            juego(ahorcado);
        }
    }
}

//• Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.

//• Método encontradas(letra): que reciba una letra ingresada por el usuario y 
//muestre //cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.


