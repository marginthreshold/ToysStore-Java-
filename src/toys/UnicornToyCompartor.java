package toys;

import java.util.Comparator;

public class UnicornToyCompartor implements Comparator<UnicornToy> {
    @Override
    public int compare(UnicornToy o1, UnicornToy o2) {
        if ((o1.getSize() > o2.getSize() && o1.getHornLength() > o2.getHornLength()) ||
                (o1.getSize() > o2.getSize() && o1.getHornLength() <= o2.getHornLength())) {
            return 1;
        } else if ((o1.getSize() < o2.getSize() && o1.getHornLength() < o2.getHornLength()) ||
                (o1.getSize() < o2.getSize() && o1.getHornLength() >= o2.getHornLength())) {
            return -1;
        } else if (o1.getSize() == o2.getSize() && o1.getHornLength() == o2.getHornLength() &&
                o1.getColor() == o2.getColor() && o1.getProduceCountry() == o2.getProduceCountry()) {
            return 0;
        }
        return -1;
    }
}
