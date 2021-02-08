import java.util.Iterator;

public class PredicateIterator<T> implements Iterator<T> {

    private Predicate predicate;
    private Iterator<T> iter;

    public PredicateIterator(Iterator<T> iter , Predicate predicate) {
        this.predicate = predicate;
        this.iter = iter;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

}
