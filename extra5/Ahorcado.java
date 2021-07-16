package extra5;

public class Ahorcado {
    private String[] palabra;
    private int cantidadLetrasEncontradas;
    private int intentos;


    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidadLetrasEncontradas, int intentos) {
        this.palabra = palabra;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return this.palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetrasEncontradas() {
        return this.cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getIntentos() {
        return this.intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
}
