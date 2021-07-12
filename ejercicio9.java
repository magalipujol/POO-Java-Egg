import org.graalvm.compiler.replacements.DefaultJavaLoweringProvider;

public class ejercicio9 {
    public static void main(String[] args) {
        Matematica numeros = new Matematica();
        numeros.setNumero1(Math.random()*11);
        numeros.setNumero2(Math.random()*11);

        System.out.println(numeros.toString());
        System.out.println("El mayor es " + numeros.devolverMayor(numeros));
        System.out.println(numeros.calcularPotencia(numeros));
    }
}
