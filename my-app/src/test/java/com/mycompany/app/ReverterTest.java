
package com.mycompany.app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ReverterTest 
    extends TestCase
{
    
    /**
     * Rigourous Test :-)
     */
    public void revertTest()
    {
    	Reverter reverter = new Reverter();
		String revertedInput = reverter.revert("123");
		boolean equal = revertedInput.equals("321");
        assertTrue( equal );
    }
}
