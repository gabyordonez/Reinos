/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos.elfos;

/**
 *
 * @author gabyordonez
 */

public class ReyMago implements Elfo {

    @Override
    public void lanzar() {
        System.out.println("Rey mago lanza");
    }

    @Override
    public void defender() {
        System.out.println("Rey mago defiende");
    }
    
}
