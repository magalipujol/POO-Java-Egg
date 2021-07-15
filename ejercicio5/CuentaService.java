package ejercicio5;
import java.util.Scanner;

public class CuentaService {
    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese su número de documento");
        cuenta.setNumeroDocumento(leer.nextInt());
        System.out.println("Ingrese su número de cuenta");
        cuenta.setNumeroDeCuenta(leer.nextInt());
        System.out.println("Ingrese su saldo actual");
        cuenta.setSaldoActual(leer.nextDouble());
        return cuenta;
    }

    public void ingresarDinero(double ingreso, Cuenta cuenta) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }

    public void retirarDinero(double retiro, Cuenta cuenta) {
        if (cuenta.getSaldoActual() >= retiro) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        } else {
            cuenta.setSaldoActual(0);
        }
    }

    public void retiroRapido(double retiro, Cuenta cuenta) {
        if (cuenta.getSaldoActual()*(0.2) <= retiro) {
            System.out.println("El retiro es mayor al 20% del saldo actual");
        } else {
            retirarDinero(retiro, cuenta);
        }
    }
}
