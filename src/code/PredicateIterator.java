package code;

import java.util.*;

public class PredicateIterator<T> implements Iterator<T> {

    private Predicate predicate;

    private Iterator<T> iter;
    private T type;
    private boolean test = false;

    public PredicateIterator(Iterator<T> iter, Predicate<T> predicate) {
        if (iter == null || predicate == null) throw new NoSuchElementException();
        this.predicate = predicate;
        this.iter =  iter;


    }

    //TODO: ->  "Java and UML", ->  "UML and Java", ->    "Java 11", ->   "UML 2.0",  ->  "Effective Java"

    @Override
    public boolean hasNext() {
        if (iter == null) throw new NoSuchElementException();

        while (iter.hasNext()) {

            type = iter.next();

            if (predicate.test(type)) {
                test = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public T next() {

        if (iter == null) throw new NoSuchElementException();
        if ( !test && type == null) { // if he didn't call hasNext first
           hasNext();

            T newTyp = type;
            type = null;
            test = false;
            return newTyp;
        }
        else if (type != null) {

            T newTyp = type;
            type = null;
            test = false;
            return newTyp;
        }
        throw new NoSuchElementException();





    }
}