package ejercicio5;
public class Cuenta {
    private int numeroDeCuenta;
    private int numeroDocumento;
    private double saldoActual;
    

    public Cuenta() {
    }

    public Cuenta(int numeroDeCuenta, int numeroDocumento, double saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.numeroDocumento = numeroDocumento;
        this.saldoActual = saldoActual;
    }

    public int getNumeroDeCuenta() {
        return this.numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public double getSaldoActual() {
        return this.saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "{" +
            " numeroDeCuenta='" + getNumeroDeCuenta() + "'" +
            ", numeroDocumento='" + getNumeroDocumento() + "'" +
            ", saldoActual='" + getSaldoActual() + "'" +
            "}";
    }
}
