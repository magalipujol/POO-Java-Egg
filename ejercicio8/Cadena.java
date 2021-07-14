package ejercicio8;
public class Cadena {
    private String frase;
    private Integer longitud;

    public Cadena() {
    }

    public Cadena(String frase, Integer longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return this.longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "{" +
            " frase='" + getFrase() + "'" +
            ", longitud='" + getLongitud() + "'" +
            "}";
    }
    
}
