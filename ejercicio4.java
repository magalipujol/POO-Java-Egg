import java.util.concurrent.RecursiveTask;

public class ejercicio4 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();


        Rectangulo rectanguloHije = rectangulo.crearRectangulo(2, 1);
        System.out.println(rectanguloHije.toString());

    }
}
