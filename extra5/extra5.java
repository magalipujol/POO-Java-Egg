package extra5;
public class extra5 {
    public static void main(String[] args) {

        Meses meses = new Meses();

        String[] arrayMeses = {"enero", "febrero", "marzo",
                               "abril","mayo","junio","julio",
                               "agosto","septiembre","octubre",
                               "noviembre","diciembre"};                       
        
        meses.setMeses(arrayMeses);

        int numeroRandom = (int) (Math.random() * 13);


        String mesSecreto = arrayMeses[numeroRandom];

        meses.adivinarMes(mesSecreto);
    }

}
