package randomFunc;

public class IntRandomFunction {
    public static int randomParam(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
