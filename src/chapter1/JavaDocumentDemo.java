package chapter1;

/**
 * @(#)JavaDocumentDemo.java        1.82 99/03/18
 *
 * Copyright (c) 2017-2018 www.andrew-deng.com.
 * All rights reserved.
 *
 * Instructor: Y. Daniel Liang <br />
 * Due: 4/3/2018 </ br>
 */


/**
 * Class description goes here.<br/>
 * Copyright (c) 2017-2018 <br/>
 * www.andrew-deng.com.<br/>
 * All rights reserved.<br/>
 * @version 1.82 18 Mar 1999  * @author
 */
public class JavaDocumentDemo {

            /* A class implementation comment can go here. */
    /**
     * classVar1 documentation comment
     */
    public static int classVar1;

    /**
     * classVar2 documentation comment that happens to be      *
     * more than one line long
     */
    private static Object classVar2;

    /**
     * instanceVar1 documentation comment
     */
    public Object instanceVar1;

    /**
     * instanceVar2 documentation comment
     */
    protected int instanceVar2;

    /**
     * instanceVar3 documentation comment
     */
    private Object[] instanceVar3;

    /**
     * ...
     * constructor JavaDocumentDemo documentation comment...
     */

    /**
     * The main method displays one message
     */
    public static void main(String[] args) {
        // Use the println statemetns to display three messages
        System.out.println("More tutorial visit www.andrew-deng.com");

    }

    /**
     * This method will print "hi" on the console!
     */
    public void sayHi() {
        System.out.println("hi");
    }
}