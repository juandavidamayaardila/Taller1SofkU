/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sofkau;

import java.util.Date;

/**
* Clase Person con 5 propiedades name, lastName1, lastName2, dateBirth, height

   Person persona = new Person(name, lastName1, lastName2, dateBirth, height);
   persona.setName(name);
   String height = persona.getHeight();
*
* @version 1.01.0001 2022-04-14
*
* @author Juan David Amaya juandavidamayaardila@gmail.com
*
* @since 1.0
*
*/
public class Person {
    private String name,lastName1, lastName2;
    private Date dateBirth;
    private float height;

    
    /**
    * Metodo constructor que permite inicializar los atributos de la clase
    * Persona persona = new Persona("Juan","Amaya","Ardila","1989-09-15","1.60")
    * 
    * @param name
    * @param lastName1
    * @param lastName2
    * @param dateBirth
    * @param height
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    
    /**
    * Metodo que permite asignar valor a la propiedad name, encase que este
    * cambie;
    * 
    * persona.setName("Juan");
    * @param name
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * Metodo que permite asignar valor a la propiedad lastName1, encase que este
    * cambie;
    * 
    * persona.setLastName1("Amaya");
    * @param lastName1
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
    * Metodo que permite asignar valor a la propiedad lastName2, encase que este
    * cambie;
    * 
    * persona.lastName2("Ardila");
    * @param lastName2 
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
    * Metodo que permite asignar valor a la propiedad dateBirth, encase que este
    * cambie;
    * 
    * persona.setDateBirth("1989-09-15");
    * 
    * @param dateBirth 
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
    * Metodo que permite asignar valor a la propiedad height, encase que este
    * cambie;
    * 
    * persona.setHeight(1.65);
    * @param height
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad name
    * float height = persona.getName();
    *
    * @return String name
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public String getName() {
        return name;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad lastName
    * float height = persona.getLastName1();
    *
    * @return String lastName
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public String getLastName1() {
        return lastName1;
    }

     /**
    * Metodo que permite acceder al valor de la propiedad lastName2
    * float height = persona.getLastName2();
    *
    * @return float lastName2
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public String getLastName2() {
        return lastName2;
    }

     /**
    * Metodo que permite acceder al valor de la propiedad dateBirth
    * float height = persona.getDateBirth();
    *
    * @return float dateBirth
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad height
    * float height = persona.getHeight();
    *
    * @return float height
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public float getHeight() {
        return height;
    }
    
    /**
    * Metodo que permite acceder a una cadena con toda la informacion 
    * de la clase, el estado de los atributos.
    *
    * @return String cadena con todos las propiedades concatenadas
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastName1=" + lastName1 + ", lastName2=" + lastName2 + ", dateBirth=" + dateBirth + ", height=" + height + '}';
    }
}
