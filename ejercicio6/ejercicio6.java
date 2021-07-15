package ejercicio6;



public class ejercicio6 {
    public static void main(String[] args) {
        CafeteraService cafeService = new CafeteraService();
        Cafetera cafetera = cafeService.crearCafetera();

        

        cafeService.llenarCafetera(cafetera);
        System.out.println(cafetera.toString());
        cafeService.servirTaza(cafetera, 250);
        System.out.println(cafetera.toString());
        cafeService.servirTaza(cafetera, 780);
        System.out.println(cafetera.toString());
        cafeService.vaciarCafetera(cafetera);
        System.out.println(cafetera.toString());
        cafeService.agregarCafe(cafetera, 300);
        System.out.println(cafetera.toString());
        cafeService.agregarCafe(cafetera, 1200);
        System.out.println(cafetera.toString());
        

    }
}
