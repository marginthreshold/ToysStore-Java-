package toys;

public class BearToy extends Toy{
    protected int bearType;
    protected static final String TYPE = "BearToy";

    public BearToy(int color, String produceCountry,int size, int bearType){
        super(color, produceCountry,size);
        this.bearType = bearType;
    }

    @Override
    public String toString() {
        return "BearToy:" +
                "bearType=" + bearType +
                ", color=" + color +
                ", produceCountry='" + produceCountry + '\'' +
                ", size=" + size;
    }

    public int getBearType() {
        return bearType;
    }
}
