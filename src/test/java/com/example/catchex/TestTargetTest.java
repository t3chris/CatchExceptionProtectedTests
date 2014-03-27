
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

        assert caughtException() instanceof MyException;
    }

    @Test
    public void testSomePublicMethod() throws MyException {
        TestTarget tgt = new TestTarget();

        catchException(tgt).somePublicMethod(5);

        assert caughtException() instanceof MyException;
    }

}
