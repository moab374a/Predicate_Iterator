public class HasLength<T> implements Predicate<String>{

    private int length;

    public HasLength(int length) {
        this.length = length;
    }


    @Override
    public boolean test(String value) {
        return false;
    }
}
