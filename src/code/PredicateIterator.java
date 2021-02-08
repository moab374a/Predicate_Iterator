package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PredicateIterator<T> implements Iterator<T> {

    private Predicate predicate;
    private Iterator<T> iter;

    public PredicateIterator(Iterator<T> iter, Predicate<T> predicate) {
        if (iter == null || predicate == null) throw new NoSuchElementException();
        this.predicate = predicate;
        this.iter = iter;


    }

    @Override
    public boolean hasNext() {
        if (iter == null) throw new NoSuchElementException();

       if (!predicate.test(iter.hasNext()))throw new NoSuchElementException();
        return iter.hasNext();
    }

    @Override
    public T next() {
        if (!predicate.test(iter.next())) throw new NoSuchElementException();
        if (iter.next() == null) throw new NoSuchElementException();

        return iter.next();
    }

}
