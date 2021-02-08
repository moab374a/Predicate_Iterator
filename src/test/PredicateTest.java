package test;

import static org.junit.Assert.assertTrue;

import code.Predicate;
import org.junit.Test;

public class PredicateTest {
    @Test
    public void shouldBeAnInterface() {
        assertTrue("code.Predicate<T> should be an interface!", Predicate.class.isInterface());
    }
}