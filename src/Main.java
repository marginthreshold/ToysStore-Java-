import boxes.BearToyBox;
import boxes.UnicornToyBox;
import lottery.Lottery;
import toys.BearToy;
import toys.UnicornToy;

import java.io.IOException;
import java.util.List;

import static factory.BearToyFactory.bearToysCollection;
import static factory.UnicornFactory.unicornToysCollection;

public class Main {
    public static void main(String[] args) throws IOException {
        List<BearToy> bearToys = bearToysCollection(3);
        BearToyBox bearsToysBox = new BearToyBox(bearToys);

        List<UnicornToy> unicornToys = unicornToysCollection(3);
        UnicornToyBox unicornToysBox = new UnicornToyBox(unicornToys);

        System.out.println(bearsToysBox);
        System.out.println(unicornToysBox);

        Lottery startLottery = new Lottery(bearsToysBox,unicornToysBox);
        startLottery.playLottery();

    }
}