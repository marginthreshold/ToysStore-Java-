package factory;

import toys.UnicornToy;

import java.util.ArrayList;
import java.util.List;

import static randomFunc.IntRandomFunction.randomParam;

public class UnicornFactory {
    public static List<UnicornToy> unicornToysCollection(int unicornToysCount) {
        List<UnicornToy> createUnicornToy = new ArrayList<>();
        for (int i = 0; i < unicornToysCount; i++) {
            createUnicornToy.add(new UnicornToy(randomParam(1, 3), "USA", randomParam(1, 3), randomParam(1, 2)));
        }
        return createUnicornToy;
    }
}
