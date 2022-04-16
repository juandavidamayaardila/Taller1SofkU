/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sofkau;

/**
* Clase Product con 3 propiedades name, stock, price
*
*   Product product = new Product(name, stock, price);
*   product.setStock(100);
*   String name = product.getName();
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
public class Product {
    private String name;
    private int stock;
    public float price;
    

    /**
    * Metodo constructor que permite inicializar los atributos de la clase,
    * 
    * Product product = new Product("mesa",100,200.000);
    * @param name
    * @param stock
    * @param price
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public Product(String name, int stock, float price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    /**
    * Metodo que permite asignar valor a la propiedad name,
    * encase que este cambie;
    * 
    * @param name
    * 
    * product.setName("Mesa");
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
    * Metodo que permite asignar valor a la propiedad stock,
    * encase que este cambie;
    * 
    * @param stock
    * 
    * product.setStock("Mesa");
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setStock(int stock) {
        this.stock = stock;
    }

     /**
    * Metodo que permite asignar valor a la propiedad price,
    * encase que este cambie;
    * 
    * @param price
    * 
    * libro.setPrice(150.000);
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad name
    * string name = product.getName();
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
    * Metodo que permite acceder al valor de la propiedad stock
    * int mark = car.getStock();
    *
    * @return int stock
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public int getStock() {
        return stock;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad price
    * float price = product.getPrice();
    *
    * @return float price
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public float getPrice() {
        return price;
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
        return "Producto{" + "name=" + name + ", stock=" + stock + ", price=" + price + '}';
    }
    
}
