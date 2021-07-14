package ejercicio4;
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

    // ASK no entiendo bien para que es esto
    // public Rectangulo crearRectangulo(int base, int altura) {
    //     Rectangulo rectangulo = new Rectangulo();

    //     rectangulo.setBase(base);
    //     rectangulo.setAltura(altura);
    //     return rectangulo;
    // }

    @Override
    public String toString() {
        return "{" +
            " base='" + getBase() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }

    public void dibujarRectangulo() {
        for (int alto = 0; alto < this.getAltura(); alto++) {
            for (int base = 0; base < this.getBase(); base++) {
                if (alto == 0 || alto == (this.getAltura() - 1) || base == 0 || base == (this.getBase() - 1) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
