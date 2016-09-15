package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		System.out.print("Enter you name :");

		String nameinput = text.nextLine();
		Reverter reverter = new Reverter();
		String revertedInput = reverter.revert(nameinput);
	    System.out.print(revertedInput);

	}

}
