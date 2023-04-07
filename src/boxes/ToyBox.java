package boxes;

import toys.Toy;

public interface ToyBox<T extends Toy> {

T getToyFromBox();
void addToyToBox(T toy);
}
