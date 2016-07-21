package org.oursight.learning;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public static String getAbsolutePath() {
        ClassLoader classLoader = AppTest.class.getClassLoader();
        File classpathRoot = new File(classLoader.getResource("").getPath());

        return classpathRoot.getPath();
    }

    public static void main(String[] args) {
        System.out.println("getAbsolutePath() = " + getAbsolutePath());
    }
}
