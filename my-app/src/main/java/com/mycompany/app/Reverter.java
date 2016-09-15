package com.mycompany.app;

public class Reverter { 

	String revert(String input) {

		String reverted = new StringBuffer(input).reverse().toString();
		return reverted;
	}

}
