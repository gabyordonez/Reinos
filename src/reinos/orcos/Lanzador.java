/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.orcos;

public class Lanzador implements Orco {

     @Override
    public void lanzar() {
        System.out.println("Lanzador lanza");
    }

    @Override
    public void defender() {
        System.out.println("Lanzador defiende");
    }
    
}

