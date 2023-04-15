package rick_guitar_shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindGuitarTester {
    public static void main() {
        Inventory inventory = new Inventory();
        Map properties = new HashMap<>();
        properties.put("builder", Builder.FENDER);
        properties.put("backWood", Wood.ALDER);
        properties.put("instrumentType", InstrumentType.GUITAR);
        InstrumentSpec whatErinLikes = new InstrumentSpec(properties);

        initializeInventory(inventory);
        List<Instrument> instruments = inventory.search(whatErinLikes);
        if (!instruments.isEmpty()) {
            for (Instrument instrument : instruments) {
                InstrumentSpec spec = instrument.getInstrumentSpec();
                System.out.println("We have a " + spec.getProperty("instrumentType") +
                        " with the following properties:");
                for (Object keyValue : spec.getProperties().keySet()) {
                    String key = keyValue.toString();
                    if (key.equals("instrumentType")) continue;
                    System.out.println(" " + key + ":" + spec.getProperty(key));
                }
            }
        } else {
            System.out.println("Sorry Erin, we have nothing for you.");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        Map guitarProperties = new HashMap<>();
        guitarProperties.put("builder", Builder.FENDER);
        guitarProperties.put("backWood", Wood.ALDER);
        guitarProperties.put("instrumentType", InstrumentType.GUITAR);
        inventory.addInstrument("V95693", 1499.95,
                new InstrumentSpec(guitarProperties),
                 InstrumentType.GUITAR);

        Map banjoProperties = new HashMap<>();
        banjoProperties.put("builder", Builder.GIBSON);
        banjoProperties.put("backWood", Wood.CEDAR);
        banjoProperties.put("instrumentType", InstrumentType.BANJO);
        inventory.addInstrument("V9512", 1549.95,
                new InstrumentSpec(banjoProperties),
                InstrumentType.BANJO);
    }
}
