package code;

import java.util.*;

public class PredicateIterator<T> implements Iterator<T> {

    private Predicate predicate;

    private ListIterator<T> iter;
    private T varaible;


    public PredicateIterator(Iterator<T> iter, Predicate<T> predicate) {
        if (iter == null || predicate == null) throw new NoSuchElementException();
        this.predicate = predicate;
        this.iter = (ListIterator<T>) iter;


    }

    @Override
    public boolean hasNext() {
        if (iter == null) throw new NoSuchElementException();

        while (iter.hasNext())
        {
            if(predicate.test(iter.next()))
            {
                iter.hasPrevious();
            }
        }
        return false;
    }

    @Override
    public T next() {
        T temp;
        while(iter.hasNext()){
            temp = iter.next();
            if (predicate.test(iter.next())){
                return temp;
            }
        }

        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
