/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinos;

import reinos.orcos.Orco;
import reinos.elfos.Elfo;

public interface AbstractFactory {
    Elfo getElfo(String type);
    Orco getOrco(String type);
}