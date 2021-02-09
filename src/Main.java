import code.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> values = List.of("Java and UML", "UML and Java", "Java 11", "UML 2.0", "Effective Java");
;

        Iterator<String> valuesEndingWithJava= values.iterator();
        Iterator<String> valuesBeginningWithJava =values.iterator();
        Iterator<String> noValues= values.iterator();



        PredicateIterator  finish = new PredicateIterator(valuesEndingWithJava,new EndsWith<>("Java"));

        PredicateIterator begin= new PredicateIterator(valuesBeginningWithJava,new StartsWith<>("Java"));

        PredicateIterator length = new PredicateIterator(noValues,new HasLength<>(4));



        System.out.println(begin.next());
        System.out.println(begin.next());
        System.out.println(begin.hasNext());



    }
}
