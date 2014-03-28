
package com.example.catchex;

import org.junit.Test;
import static com.googlecode.catchexception.CatchException.*;

/**
 *
 * @author Christian Reiter <christian.reiter@sparkasse-bank-malta.com>
 */
public class TestTargetTest {


    @Test
    public void testSomeMethod() throws MyException {
        TestTarget tgt = new TestTarget();

        catchException(tgt).someMethod(5);

        final Exception caughtException = caughtException();

        System.out.println("caughtException.getClass(): " + caughtException.getClass());
        System.out.println("caughtException.getMessage(): " + caughtException.getMessage());
        IllegalArgumentException illegalArgEx = (IllegalArgumentException) caughtException();
        System.out.println("illegalArgEx.getCause(): " + illegalArgEx.getCause());
        System.out.println("illegalArgEx.getSuppressed(): " + illegalArgEx.getSuppressed());

        System.out.println("Stacktrace:\n");
        caughtException.printStackTrace();

        assert caughtException instanceof MyException;
    }

    @Test
    public void testSomePublicMethod() throws MyException {
        TestTarget tgt = new TestTarget();

        catchException(tgt).somePublicMethod(5);

        assert caughtException() instanceof MyException;
    }

}
