
package com.example.catchex;

/**
 *
 * @author Christian Reiter <christian.reiter@sparkasse-bank-malta.com>
 */
public class TestTarget {

    protected void someMethod(int input) throws MyException {
        if( input != 1 ) {
            throw new MyException();
        }
    }

    public void somePublicMethod(int input) throws MyException {
        if( input != 1 ) {
            throw new MyException();
        }
    }

}
