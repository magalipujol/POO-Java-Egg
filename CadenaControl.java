import java.net.ContentHandlerFactory;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class CadenaControl {
    
    Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        Integer longitud = frase.length();
        
        return new Cadena(frase, longitud);
    }


    public Integer mostrarVocales(Cadena cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            switch (cadena.getFrase().substring(i, i + 1)) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    contador += 1;
                    break;
            
                default:
                    break;
            }
        }
        return contador;
    }

    public String invertirFrase(Cadena cadena){  
        String str = cadena.getFrase();
        StringBuilder sb = new StringBuilder(str);  
        sb.reverse();  
        return sb.toString();  
    }  

    public Integer vecesRepetido(Cadena cadena) {
        Integer contador = 0;
        System.out.println("Ingrese una letra para buscar en la frase");
        String letra = leer.nextLine();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().subSequence(i, i + 1).equals(letra)) {
                contador += 1;
            }
        }
        return contador;
    }

    public boolean compararLongitud(Cadena cadena) {
        System.out.println("Escriba una cadena para comparar su longitud");
        String cadenaUsuario = leer.nextLine();
        return (cadena.getLongitud() == cadenaUsuario.length());
    }

    public String unirFrases(Cadena cadena) {
        System.out.println("Ingrese una frase para unir a la cadena");
        String cadenaUnida = cadena.getFrase() + leer.nextLine();
        return cadenaUnida;
    }

    public String reemplazar(Cadena cadena) {
        System.out.println("Ingrese un caracter para reemplazar las 'a'");
        String cadenaReemplazada = cadena.getFrase().replaceAll("a", leer.nextLine());
        return cadenaReemplazada;
    }

    public boolean contiene(Cadena cadena) {
        System.out.println("Ingrese un caracter");
        return cadena.getFrase().contains(leer.nextLine());
    }

}
