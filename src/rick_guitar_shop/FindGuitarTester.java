package rick_guitar_shop;

import java.util.List;

public class FindGuitarTester {
    public static void main() {
        Inventory inventory = new Inventory();
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

        initializeInventory(inventory);
        List<Instrument> instruments = inventory.search(whatErinLikes);
        if (!instruments.isEmpty()) {
            System.out.println("Erin, you might like these guitars: ");
            for (Instrument instrument : instruments) {
                InstrumentSpec spec = instrument.getInstrumentSpec();
                System.out.println("We have a "+
                        spec.getBuilder() + " " + spec.getModel() + " "+
                        spec.getType() + " guitar:\n " +
                        spec.getBackWood() + " back and sides,\n" +
                        spec.getTopWood() + " top.\nYou can have it for only $" +
                        instrument.getPrice() + "!\n-----"
                );
            }
        } else {
            System.out.println("Sorry Erin, we have nothing for you.");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("V95693", 1499.95,
                new InstrumentSpec(Builder.FENDER, "Stratocastor",
                        Type.ELECTRIC, Wood.ALDER, Wood.ALDER),
                 InstrumentType.GUITAR);
        inventory.addInstrument("V9512", 1549.95,
                new InstrumentSpec(Builder.FENDER, "Stratocastor",
                        Type.ELECTRIC, Wood.ALDER, Wood.ALDER),
                InstrumentType.BANJO);
    }
}
