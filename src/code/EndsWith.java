package code;

public class EndsWith<T> implements Predicate<String> {

    private  String suffix;


    public EndsWith(String suffix) {
        if (suffix == null) throw new IllegalArgumentException();
        this.suffix = suffix;
    }

    @Override
    public boolean test(String value) {
        if (value == null) return false;

        return value.endsWith(suffix);
    }
}
