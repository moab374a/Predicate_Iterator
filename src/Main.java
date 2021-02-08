import code.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // List<String> values = List.of("Java and UML", "UML and Java", "Java 11", "UML 2.0", "Effective Java");
;

/*
        Iterator<String> valuesEndingWithJava= values.iterator();
        Iterator<String> valuesBeginningWithJava =values.iterator();
        Iterator<String> noValues= values.iterator();
        */



      /*  PredicateIterator begin= new PredicateIterator(valuesBeginningWithJava,start);
        PredicateIterator  finish = new PredicateIterator(valuesEndingWithJava,end);
        PredicateIterator length = new PredicateIterator(noValues,lengthIs);*/

        // The compared Values
        Predicate<String> start = new StartsWith<>("java");
        Predicate<String> end = new EndsWith<>("va");
        Predicate<String>  lengthIs = new HasLength<>(4);

        System.out.println(start.test("ja"));
        System.out.println(end.test("va"));
        System.out.println(lengthIs.test("java"));

    }
}
