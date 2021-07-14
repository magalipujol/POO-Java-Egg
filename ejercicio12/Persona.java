package ejercicio12;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner (System.in);
   
    private String name;
    private Date birthday;


    public Persona() {
    }

    public Persona(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void crearPersona(){
        System.out.println("Nombre:");
        name=leer.next();
        
        int dia, mes, anio;
        System.out.println("Día de nacimiento:");
        dia=leer.nextInt();
        System.out.println("Mes de nacimiento:");
        mes=leer.nextInt()-1;
        System.out.println("Año de nacimiento:");
        anio=leer.nextInt()-1900;
        Date fecha = new Date(anio,mes,dia);
        birthday = fecha;
    }


    @Override
    public String toString() {
        return "{" +
            "name='" + getName() + "'" +
            ", birthday='" + getBirthday() + "'" +
            "}";
    }


    public int calcularEdad() {
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear();
        return  (anioActual - birthday.getYear()); 
    }

    public boolean menorQue(int edadAComparar) {
        return (this.calcularEdad() < edadAComparar);
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + this.getName());
        System.out.println("Fecha de nacimiento: " + this.getBirthday());

    }
}
