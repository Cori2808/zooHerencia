/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.clase03.zooherencia;

/**
 *
 * @author acmat
 */
public class ZooHerencia {

    public static void main(String[] args) {
       
        Animal perro = new Doberman("Firu");
        Mamifero gato = new Siames("Luna");
        Mamifero perro2 = new PastorAleman("Balto");
        
        Animal pato= new Ave("Lucas");
        Rouen otroPato = new Rouen("Donald");
        Ave tercerPato = new Pato("Rico McPat");
        
        System.out.println(pato.hacerSonido());
        System.out.println(gato.hacerSonido());
        
        System.out.println(otroPato.hacerSonido());
        System.out.println(tercerPato.hacerSonido());
        
        System.out.println("'''''LOS PERROS''''''");
        System.out.println(perro.hacerSonido());
        System.out.println(perro2.hacerSonido());
    }
}
