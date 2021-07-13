import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {

        int[] arrayA = new int[50];
        int[] arrayB = new int[20];

        // rellenar array A con 50 valores aleatorios
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random()*11);
        }

        System.out.println(mostrarArray(arrayA));
        // ordenar arrayA
        Arrays.sort(arrayA);

        System.out.println(mostrarArray(arrayA));

        // // rellenar el arrayB con los 10 primeros de arrayA ordenado
        // arrayB = Arrays.copyOfRange(arrayA, 0, 20);
        // // rellenar los ultimos 10 valores del arrayB con 11 (era 0.5 pero bueno)
        // Arrays.fill(arrayB, 10, 20, 11);

        int[] arrayAux = Arrays.copyOfRange(arrayA, 0, 10);
        arrayB = Arrays.copyOf(arrayAux, 20);
        Arrays.fill(arrayB, 10, 20, 11);

        System.out.println(mostrarArray(arrayB));
    }

    public static String mostrarArray(int[] array) {
        String arrayString = "[ ";
        for (int i = 0; i < array.length; i++) {
            arrayString += array[i] + ", ";
        }
        return arrayString += "]";
    }

}
