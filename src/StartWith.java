public class StartWith<T> implements Predicate<String>{

    private String prefix;

    public StartWith(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean test(String value) {
        return false;
    }



}
