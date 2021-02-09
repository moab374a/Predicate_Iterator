package code;

public class StartsWith<T> implements Predicate<String>{

    private String prefix;


    public StartsWith(String prefix) {
        if (prefix == null) throw new IllegalArgumentException();
        this.prefix = prefix;
    }

    @Override
    public boolean test(String value) {


        if (value == null) return false;
        else if (!prefix.isEmpty() && value.isEmpty()) return false;
        else if (prefix.isEmpty()) return true;

        return prefix.startsWith(value) ;
    }



}
