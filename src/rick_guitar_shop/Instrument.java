package rick_guitar_shop;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec;
    private InstrumentType instrumentType;

    public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec, InstrumentType instrumentType) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
        this.instrumentType = instrumentType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
