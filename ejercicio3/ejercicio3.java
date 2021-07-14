package ejercicio3;
public class ejercicio3 {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.setNumero1(4);
        operacion.setNumero2(2);

         System.out.println(operacion.dividir(operacion.getNumero1(), operacion.getNumero2()));
    }
}
