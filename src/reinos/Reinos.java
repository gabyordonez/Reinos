/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos;

import reinos.orcos.Orco;
import reinos.elfos.Elfo;


public class Reinos {

    public static void main(String[] args) {
        AbstractFactory factory;
 
        factory=  FactoryProducer.getFactory("Orcos");
        Orco orcos;
        orcos = factory.getOrco("Lanzador");
        orcos.lanzar();
        orcos.defender();
        
        System.out.println();
 
        factory= FactoryProducer.getFactory("Elfos");
        Elfo elfo = factory.getElfo("Mago");
        elfo.lanzar();
        elfo.defender();
    }
    
}