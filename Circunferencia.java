public class Circunferencia {
    private double radio;

    // metedo constructor que inicializa el radio pasado como parametro
    public Circunferencia () {}
    
    // metodos get y set para el radio

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // TODO está bien?
    // metido que pide el radio y lo guarda en el atributo del objeto
    public void crearCircunferencia (double radioParametro) {
        Circunferencia circulo = new Circunferencia();
        circulo.radio = radioParametro;
    }

    // metodo que calcula el area
    public double area(double radioParametro) {
        double area = Math.PI * Math.pow(radioParametro, 2);
        return area;
    }

    // metodo que calcule el perimetro
    public double perimetro(double radioParametro) {
        double perimetro = Math.PI * 2 * radioParametro;
        return perimetro;
    }

}
