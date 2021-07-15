package ejercicio6;

public class CafeteraService {
    
    public Cafetera crearCafetera() {
        Cafetera cafetera = new Cafetera();
        int capacidadMaxima = 1000, cantidadActual = 0;
        cafetera.setCantidadActual(cantidadActual);
        cafetera.setCapacidadMaxima(capacidadMaxima);
        return cafetera;
    }
    
    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    public void servirTaza(Cafetera cafetera, int tamaniotaza) {
        if (tamaniotaza > cafetera.getCantidadActual()) {
            System.out.println("En la taza quedaron " + cafetera.getCantidadActual() + "ml de café");
            vaciarCafetera(cafetera);
        } else {
            System.out.println("Se llenó la taza");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamaniotaza);
        }
    }

    public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
        if (cantidadCafe + cafetera.getCantidadActual() <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
        } else {
            llenarCafetera(cafetera);
            System.out.println("La cantidad de café es too much");
        }
    }

}

