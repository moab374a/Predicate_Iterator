public class EndWith<T> implements Predicate<String> {

    private  int suffix;


    public EndWith(int suffix) {
        suffix = suffix;
    }

    @Override
    public boolean test(String value) {
        return false;
    }
}
