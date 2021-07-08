public class Operacion {
    private Integer numero1;
    private Integer numero2;
    
    public Operacion() {}

    

    public Operacion(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    public Integer getNumero1() {
        return this.numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return this.numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }
    


    // TODO no anda :(
    public Operacion crearOperacion(Integer numero1, Integer numero2) {
        Operacion operacion = new Operacion();

        operacion.setNumero1(numero1);
        operacion.setNumero2(numero2);

        return operacion;
    }

    public void imprimirNumeros() {
        System.out.println("Numero 1: " + numero1 + "\nNumero 2: "+ numero2);
    }

    public Integer sumar(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

    public Integer restar(Integer numero1, Integer numero2) {
        return numero1 - numero2;
    }

    public Integer multiplicar(Integer numero1, Integer numero2) {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Se está multiplicando por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    public double dividir(Integer numero1, Integer numero2) {
        if (numero2 == 0) {
            System.out.println("Se está dividiendo por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}