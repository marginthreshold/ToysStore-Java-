package toys;

public abstract class Toy {
    protected int color;
    protected String produceCountry;
    int size;

    public Toy(int color,String produceCountry, int size) {
        this.color = color;
        this.produceCountry = produceCountry;
        this.size = size;
    }

    public int getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String getProduceCountry() {
        return produceCountry;
    }
}
