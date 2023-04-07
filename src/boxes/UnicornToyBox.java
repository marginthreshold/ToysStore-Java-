package boxes;

import toys.UnicornToy;
import java.util.List;
import static randomFunc.IntRandomFunction.randomParam;

public class UnicornToyBox implements ToyBox<UnicornToy> {

    private List<UnicornToy> unicornToys;
    private int countUnicornToys;

    public UnicornToyBox(List<UnicornToy> unicornToys) {
        this.unicornToys = unicornToys;
        this.countUnicornToys = unicornToys.size();
    }

    @Override
    public UnicornToy getToyFromBox() {
        if (this.countUnicornToys == 0) {
            System.out.println("Коробка с медведями пуста\n Извините, нужно пополнить коробки и продолжить позже");
            System.exit(1);
        }
        int chooseUnicornToy = randomParam(0, this.countUnicornToys);
        this.countUnicornToys --;
        UnicornToy randomUnicornToy = this.unicornToys.get(chooseUnicornToy);
        this.unicornToys.remove(randomUnicornToy);
        System.out.println(randomUnicornToy + " вытащили из коробки");
        return randomUnicornToy;
    }

    @Override
    public void addToyToBox(UnicornToy toy) {
        this.unicornToys.add(toy);
        this.countUnicornToys ++;
    }

    @Override
    public String toString() {
        return "UnicornToyBox" + unicornToys;
    }
}
