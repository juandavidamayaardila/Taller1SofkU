/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sofkau;

/**
*   Clase Persona con 2 propiedades accountNumber, activated

   AccountBank cuenta = new AccountBank(23543516, true);
   cuenta.setAccountNumber(54546546);
   String accountNumber = cuenta.getAccountNumber();
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
public class AccountBank {
    private int accountNumber;
    private boolean  activated;

    /**
    * Metodo constructor que permite inicializar los atributos de la clase,
    * 
    * CuentaBancara cuenta = new CuentaBancaria(123456,true);
    * 
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public AccountBank(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    /**
    * Metodo que permite asignar valor a la propiedad accountNumber,
    * encase que este cambie;
    * 
    * @param accountNumber
    * 
    * persona.setAccountNumber("Mango");
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
    * Metodo que permite asignar valor a la propiedad activated, encase que este
    * cambie;
    * @param activated
    * persona.setActivated(false);
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad accountNumber
    * int cuenta = cuenta.getAccountNumber();
    *
    * @return int accountNumber
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
    * Metodo que permite acceder al valor de la propiedad activated
    * boolean activated = cuenta.isActivated();
    *
    * @return boolean activated
    *
    * @author Juan David Amaya juandavidamayaardila@gmail.com
    *
    * @since 1.0
    *
    */
    public boolean isActivated() {
        return activated;
    }

    
}
