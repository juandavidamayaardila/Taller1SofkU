/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sofkau;

/**
*   Clase Car con 3 propiedades mark, modelo, speed
*
*   Car car = new Car("Chevrolet","2022",350);
*   car.setMark("Audi");
*   String mark = car.getMark();
* 
* @version 1.01.0001 2022-04-14
*
*
* @author Juan David Amaya juandavidamayaardila@gmail.com
*
* @since 1.0
*
*/
public class Car {
    private String mark, modelo;
    private float speed;

    
    /**
    * Metodo constructor que permite inicializar los atributos de la clase,
    * 
    * Car car = new Car("Chevrolet","2022",350);
    * @param mark
    * @param modelo
    * @param speed
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public Car(String mark, String modelo, float speed) {
        this.mark = mark;
        this.modelo = modelo;
        this.speed = speed;
      
    }
    
   
    /**
    * Metodo que permite asignar valor a la propiedad mark,
    * encase que este cambie;
    * 
    * @param mark
    * 
    * libro.setMark("Ferrari");
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
    * Metodo que permite asignar valor a la propiedad modelo,
    * encase que este cambie;
    * 
    * @param modelo
    * 
    * libro.setModelo("2023");
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
    * Metodo que permite asignar valor a la propiedad speed,
    * encase que este cambie;
    * 
    * @param speed
    * 
    * libro.setSpeed(400.0);
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad mark
    * string mark = car.getMark();
    *
    * @return String mark
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public String getMark() {
        return mark;
    }

     /**
    * Metodo que permite acceder al valor de la propiedad mark
    * string mark = car.getMark();
    *
    * @return String mark
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public String getModelo() {
        return modelo;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad speed
    * float speed = car.getSpeed();
    *
    * @return float speed
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public float getSpeed() {
        return speed;
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
        return "Carro{" + "mark=" + mark + ", modelo=" + modelo + ", speed=" + speed + '}';
    }

    
}
