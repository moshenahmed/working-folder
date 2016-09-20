
package com.mycompany.app;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


 
 
public class ReverterTest 
{
    
    
     
     
    public void revertTest()
    {
    	Reverter reverter = new Reverter();
		String revertedInput = reverter.revert("123");
		boolean equal = revertedInput.equals("321");
        assertTrue( equal );
    }

	private void assertTrue(boolean equal) {
		// TODO Auto-generated method stub
		
	}
}
