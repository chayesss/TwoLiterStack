/*
 * Charlie Hayes
 * hayesc9@mail.uc.edu
 * Assignment 10
 * IT2045C Spring 2022
 * Due: 4/3/2022
 * This program creates a stack with two liter bottles of soda and prints the total price and amount of dr. pepper in the stack
 */
package main;

import java.text.DecimalFormat;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// ToDo Declare and instantiate a TwoLiterStack object
		Stack<TwoLiter> twoLiterStack = new Stack<TwoLiter>();
		
		// ToDo Add 100000 items to the stack by calling the add method in the TwoLiter class. Note that the method is static
		TwoLiter.add(twoLiterStack, 100000);
		
		// ToDo print the number of items in the TwoLiterStack object
		System.out.println("The stack has " + twoLiterStack.size() + " items in it.");
		
		// ToDo Iterate over the stack and compute the total price of all the items. An enhanced for loop is good here.
		double totalPrice = 0;
		for (TwoLiter twoLiter : twoLiterStack) {
			totalPrice += twoLiter.getPrice();
		}
		
		
		// ToDo Print the total price to exactly two decimal places.
		// ToDo in the comments here, explain why this number changes each time you run the program.
	    DecimalFormat df2 = new DecimalFormat("#.##");
		System.out.println("Total Price is $" + df2.format(totalPrice));
		
		// ToDo Compute the number of Dr. Pepper 2-liters in the stack
		int totalDrPepper = 0;
		for (TwoLiter twoLiter : twoLiterStack) {
			if (twoLiter.getFlavor().equals("Dr. Pepper")) {totalDrPepper++;}
		}		
		System.out.println("Total Dr. Pepper = " + totalDrPepper);
		
	}
}
