package rick_guitar_shop;

public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model,
                      Type type, Wood backWood, Wood topWood,
                      int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec searchSpec) {
        if (!super.matches(searchSpec)) {
            return false;
        }
        if (!(searchSpec instanceof GuitarSpec)) {
            return false;
        }
        if (numStrings != ((GuitarSpec) searchSpec).numStrings) {
            return false;
        }
        return true;
    }
}
