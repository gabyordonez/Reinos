
package reinos.elfos;
import reinos.AbstractFactory;
import reinos.orcos.Orco;


public class FactoryElfos implements AbstractFactory {

    @Override
    public Elfo getElfo(String type) {
        switch (type) {
            case "Arquero":
                return (Elfo) new Arquero();
            case "Mago":
                return (Elfo) new Mago();
            case "Rey MAgo":
                return (Elfo) new ReyMago();
        }
        return null;
    }

    @Override
    public Orco getOrco(String type) {
        return null;
    }

}