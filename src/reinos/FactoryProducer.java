/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos;

import reinos.elfos.FactoryElfos;
import reinos.orcos.FactoryOrcos;

public class FactoryProducer {
    
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Orco": 
                return new  FactoryOrcos(); 
            case "Elfo": 
                return new FactoryElfos(); 
        } 
        return null; 
    } 
    
}