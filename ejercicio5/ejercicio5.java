package ejercicio5;
public class ejercicio5 {
    public static void main(String[] args) {
        CuentaService cuentaService = new CuentaService();
        Cuenta cuentaBancaria = cuentaService.crearCuenta();
    
        System.out.println(cuentaBancaria.toString());
        cuentaService.retirarDinero(200, cuentaBancaria);
        System.out.println(cuentaBancaria.toString());
        cuentaService.retiroRapido(300, cuentaBancaria);
        System.out.println(cuentaBancaria.toString());
        cuentaService.retiroRapido(150, cuentaBancaria);
        System.out.println(cuentaBancaria.toString());

    }
}
