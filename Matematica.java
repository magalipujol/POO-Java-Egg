public class Matematica {
    private double numero1;
    private double numero2;


    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return this.numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return this.numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "{" +
            " numero1='" + getNumero1() + "'" +
            ", numero2='" + getNumero2() + "'" +
            "}";
    }

    public double devolverMayor(Matematica numeros) {
        return Math.max(numeros.getNumero1(), numeros.getNumero2());
    }

    public double calcularPotencia(Matematica numeros) {
        if (devolverMayor(numeros) == numeros.getNumero1()){
            return Math.pow(Math.round(numeros.getNumero1()), Math.round(numeros.getNumero2()));
        } else {
            return Math.pow(Math.round(numeros.getNumero2()), Math.round(numeros.getNumero1()));
        }
    }

    public double calcularRaiz(Matematica numeros) {
        if (devolverMayor(numeros) == numeros.getNumero1()) {
            return Math.sqrt(Math.round(numeros.getNumero2()));
        } else {
            return Math.sqrt(Math.round(numeros.getNumero1()));
        }
    }

}
