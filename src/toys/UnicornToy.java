package toys;

public class UnicornToy extends Toy {
    protected int hornLength;
    protected static final String TYPE = "UnicornToy";

    public UnicornToy(int color, String produceCountry, int size, int hornLength) {
        super(color, produceCountry, size);
        this.hornLength = hornLength;
    }

    @Override
    public String toString() {
        return "UnicornToy:" +
                "hornLength=" + hornLength +
                ", color=" + color +
                ", produceCountry='" + produceCountry + '\'' +
                ", size=" + size;
    }

    public int getHornLength() {
        return hornLength;
    }
}
