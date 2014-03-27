
package com.example.catchex;

/**
 *
 * @author Christian Reiter <christian.reiter@sparkasse-bank-malta.com>
 */
public class MyException extends Exception {

    /**
     * Creates a new instance of <code>MyException</code> without detail
     * message.
     */
    public MyException() {
    }

    /**
     * Constructs an instance of <code>MyException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MyException(String msg) {
        super(msg);
    }
}
