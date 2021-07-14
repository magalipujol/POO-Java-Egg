package ejercicio1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Libro libro1 = new Libro();

        Scanner leer = new Scanner(System.in);

        libro1.ISBN = leer.nextInt();
        libro1.titulo = leer.next();
        libro1.autor = leer.next();
        libro1.cantidadPaginas = leer.nextInt();

        leer.close();
        
        System.out.println("Titulo: " + libro1.titulo + "\n" + "Autor: " + libro1.autor);
        System.out.println("ISBN: " + libro1.ISBN + "\n" + "Cantidad de páginas: " + libro1.cantidadPaginas);

    }
}
