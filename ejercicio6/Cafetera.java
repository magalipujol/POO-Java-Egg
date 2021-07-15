package ejercicio6;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;


    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return this.cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }


    @Override
    public String toString() {
        return "{" +
            " capacidadMaxima='" + getCapacidadMaxima() + "'" +
            ", cantidadActual='" + getCantidadActual() + "'" +
            "}";
    }

}
