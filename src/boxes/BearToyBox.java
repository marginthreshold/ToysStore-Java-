package boxes;

import toys.BearToy;

import java.util.List;

import static randomFunc.IntRandomFunction.randomParam;

public class BearToyBox implements ToyBox<BearToy> {

    private List<BearToy> bearToys;
    private int countBearToys;

    public BearToyBox(List<BearToy> bearToys) {
        this.bearToys = bearToys;
        this.countBearToys = bearToys.size();
    }

    @Override
    public BearToy getToyFromBox() {
        if (this.countBearToys == 0) {
            System.out.println("Коробка с медведями пуста\n Извините, нужно пополнить коробки и продолжить позже");
            System.exit(1);
        }
        int chooseBearToy = randomParam(0, this.countBearToys);
        this.countBearToys --;
        BearToy randomBearToy = this.bearToys.get(chooseBearToy);
        this.bearToys.remove(randomBearToy);
        System.out.println(randomBearToy+ " вытащили из коробки");
        return randomBearToy;
    }

    @Override
    public void addToyToBox(BearToy toy) {
        this.bearToys.add(toy);
        this.countBearToys ++;
    }

    @Override
    public String toString() {
        return "BearToyBox" + bearToys;
    }
}
