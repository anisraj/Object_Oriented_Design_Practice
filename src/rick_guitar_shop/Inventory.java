package rick_guitar_shop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory() {
        inventory = new ArrayList();
    }

    public void addInstrument(String serialNumber, double price,
                          InstrumentSpec instrumentSpec, InstrumentType instrumentType) {
        Instrument instrument = new Instrument(serialNumber, price, instrumentSpec, instrumentType);
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List search(InstrumentSpec searchSpec) {
        List matchingInstruments = new LinkedList();
        for (Instrument instrument : inventory) {
            if (instrument.getInstrumentSpec().matches(searchSpec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}
