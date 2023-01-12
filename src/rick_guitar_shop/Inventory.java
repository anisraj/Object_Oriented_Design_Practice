package rick_guitar_shop;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backWood, Wood topWood, int numStrings) {
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood, numStrings);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<>();
        for (Guitar guitar : guitars) {
            if (guitar.getGuitarSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
