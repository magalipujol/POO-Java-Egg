import org.w3c.dom.css.Rect;

public class Rectangulo {
    private Integer base;
    private Integer altura;

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(){}

    public Integer getBase() {
        return this.base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return this.altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    public Integer calcularSuperficie(Integer base, Integer altura){
        return base * altura;
    }

    public Integer calcularPerimetro(Integer base, Integer altura) {
        return (base + altura) / 2;
    }

    public Rectangulo crearRectangulo(int base, int altura) {
        Rectangulo rectangulo = new Rectangulo();

        rectangulo.setBase(base);
        rectangulo.setAltura(altura);
        return rectangulo;
    }

    @Override
    public String toString() {
        return "{" +
            " base='" + getBase() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }
    
}
