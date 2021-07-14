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
        nombre=input.next();
        
        int dia, mes, anio;
        System.out.println("Día de nacimiento:");
        dia=input.nextInt();
        System.out.println("Mes de nacimiento:");
        mes=input.nextInt()-1;
        System.out.println("Año de nacimiento:");
        anio=input.nextInt()-1900;
        Date fecha = new Date(anio,mes,dia);
        fechaNacimiento = fecha;
    }


}
