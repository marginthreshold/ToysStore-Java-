package factory;

import toys.BearToy;

import java.util.ArrayList;
import java.util.List;

import static randomFunc.IntRandomFunction.randomParam;

public class BearToyFactory {
    public static List<BearToy> bearToysCollection(int bearToysCount) {
        List<BearToy> createBearToy = new ArrayList<>();
        for (int i = 0; i < bearToysCount; i++) {
            createBearToy.add(new BearToy(randomParam(1, 5), "China", randomParam(1, 5), randomParam(1, 3)));
        }
        return createBearToy;
    }
}
