/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sofkau;

import java.util.ArrayList;

/**
* Clase Fruit con 3 propiedades name, averageWeight, colors
* colors es una lista.
* 
* 
*  Fruit fruta = new Fruit(name, averageWeight, colors);
*  fruta.setName(name);
*  String height = fruta.getName();
* 
*
* @version 1.01.0001 2022-04-14
*
* @author Juan David Amaya juandavidamayaardila@gmail.com
*
* @since 1.0
*
*/
public class Fruit {
    private String name;
    private float averageWeight;
    private ArrayList<String> colors;

    
    /**
    * Metodo constructor que permite inicializar los atributos de la clase,
    * colors es una lista de string
    * 
    * @param name
    * @param averageWeight
    * @param colors
    * 
    * Fruta fruta = new Fruta("Mango",12.5,colors);
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    

    /**
    * Metodo que permite asignar valor a la propiedad name, encase que este
    * cambie;
    * 
    * @param name
    * persona.setName("Mango");
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
    * Metodo que permite asignar valor a la propiedad averageWight, encase que este
    * cambie;
    * @param averageWeight //promedio de peso de la fruta
    * 
    * persona.setAverageWeight(1.65);
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
    * Metodo que permite asignar valor a la propiedad colors, encase que este
    * cambie, colors es una lista de String
    * 
    * @param colors
    * 
    * persona.setColors(colors);
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad name
    * String name = fruta.getName();
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
    * Metodo que permite acceder al valor de la propiedad averageWeight
    * float averageWeight = persona.getAverageWeight();
    *
    * @return float averageWeight
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
    * Metodo que permite acceder a la lista de colores correspondiente a la 
    * propiedad colors.
    * 
    * float height = persona.getColors();
    *
    * @return colors
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public ArrayList<String> getColors() {
        return colors;
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
        return "Fruta{" + "name=" + name + ", averageWeight=" + averageWeight + ", colors=" + colors + '}';
    }
    
}
