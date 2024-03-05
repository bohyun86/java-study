package library.lang;

public class ShallowCopy implements Cloneable {
    int[] array;

    public ShallowCopy(int[] array) {
        this.array = array;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
