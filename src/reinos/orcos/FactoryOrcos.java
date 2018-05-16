
package reinos.orcos;
import reinos.AbstractFactory;
import reinos.elfos.Elfo;


public class FactoryOrcos implements AbstractFactory {

    @Override
    public Elfo getElfo(String type) {
        return null;
    }

    @Override
    public Orco getOrco(String type) {
        switch (type) {
            case "Lanzador":
                return (Orco) new Lanzador();
            case "Hechicero":
                return (Orco) new Hechicero();
            case "Bestia Mayor":
                return (Orco) new BestiaMayor();
        }
        return null;
    }


}