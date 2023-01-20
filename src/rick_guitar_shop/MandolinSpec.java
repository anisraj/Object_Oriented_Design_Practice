package rick_guitar_shop;

public class MandolinSpec extends InstrumentSpec {

    private Style style;

    public MandolinSpec(Builder builder, String model,
                        Type type, Wood backWood,
                        Wood topWood, Style style) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec searchSpec) {
        if (!super.matches(searchSpec)) {
            return false;
        }
        if (!(searchSpec instanceof MandolinSpec)) {
            return false;
        }
        if (!style.equals(((MandolinSpec) searchSpec).style)) {
            return false;
        }
        return true;
    }
}
