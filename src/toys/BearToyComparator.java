package toys;

import java.util.Comparator;

public class BearToyComparator implements Comparator<BearToy> {
    @Override
    public int compare(BearToy o1, BearToy o2) {
        if ((o1.getSize() > o2.getSize() && o1.getBearType() > o2.getBearType()) ||
                (o1.getSize() > o2.getSize() && o1.getBearType() <= o2.getBearType())) {
            return 1;
        } else if ((o1.getSize() < o2.getSize() && o1.getBearType() < o2.getBearType()) ||
                (o1.getSize() < o2.getSize() && o1.getBearType() >= o2.getBearType())) {
            return -1;
        } else if (o1.getSize() == o2.getSize() && o1.getBearType() == o2.getBearType() &&
                o1.getColor() == o2.getColor() && o1.getProduceCountry() == o2.getProduceCountry()) {
            return 0;
        }
        return -1;
    }
}
