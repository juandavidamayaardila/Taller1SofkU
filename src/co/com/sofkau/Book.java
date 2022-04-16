/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sofkau;

import java.util.Date;

/**
*   Clase Book con 3 propiedades name, author, publicationDate

   Book libro = new Book("Cien años de soledad","Gabril Garcia", 2022-04-14);
   libro.setName("Cien años");
   String nameBook = cuenta.getAccountNumber();
* 
*
* @version 1.01.0001 2022-04-14
*
*
* @author Juan David Amaya juandavidamayaardila@gmail.com
*
* @since 1.0
*
*/
public class Book {
    private String name, author;
    private Date publicationDate;

    /**
    * Metodo constructor que permite inicializar los atributos de la clase,
    * 
    * CuentaBancara cuenta = new CuentaBancaria(123456,true);
    * @param name
    * @param author
    * @param publicationDate
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public Book(String name, String author, Date publicationDate) {
        this.name = name;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    
    /**
    * Metodo que permite acceder al valor de la propiedad name
    * string name = libro.getName();
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
    * Metodo que permite acceder al valor de la propiedad author
    * string name = libro.getAuthor();
    *
    * @return String author
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public String getAuthor() {
        return author;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad PublicationDate
    * Date publicationDate = libro.getPublicationDate();
    *
    * @return Date publicationDate
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public Date getPublicationDate() {
        return publicationDate;
    }

    /**
    * Metodo que permite asignar valor a la propiedad name,
    * encase que este cambie;
    * 
    * @param name
    * 
    * libro.setName("Cien años de soledad");
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
    * Metodo que permite asignar valor a la propiedad author,
    * encase que este cambie;
    * 
    * @param author
    * 
    * persona.setAuthor("Gabril Garcia Marquez");
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setAuthor(String author) {
        this.author = author;
    }


     /**
    * Metodo que permite asignar valor a la propiedad publicationDate,
    * encase que este cambie;
    * 
    * @param publicationDate
    * 
    * persona.setPublicationDate(1989-09-15);
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
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
        return "Libro{" + "name=" + name + ", author=" + author  + ", publicationDate=" + publicationDate + '}';
    }
}
