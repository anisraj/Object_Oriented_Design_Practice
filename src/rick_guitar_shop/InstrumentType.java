package rick_guitar_shop;

public enum InstrumentType {
    MANDOLIN,
    GUITAR,
    BANJO;

    @Override
    public String toString() {
        switch (this) {
            case BANJO : return "Banjo";
            case GUITAR: return "Guitar";
            case MANDOLIN: return "Mandolin";
            default: return "Unspecified";
        }
    }
}
