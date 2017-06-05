package LabAssignments;

import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		int testArray[][];
		
		testArray = new int[10][10];
		
		System.out.println("This is the first array result:");
		display(testArray);
		
		System.out.println("This is the second array result:");
		patternRow(testArray);
		
		System.out.println("This is the third array result:");
		patternCheckered(testArray);
		
		System.out.println("This is the fourth array result:");
		userChoice(testArray);
		
	}
	
	public static void display(int x[][]) {
		for(int row=0; row<x.length; row++) {
			for(int column=0; column<x[row].length; column++) {
				System.out.print("1");
			}
			
			System.out.println();
		}
	}
	
	public static void patternRow(int x[][]) {
		for(int row=0; row<x.length; row++) {
			for(int column=0; column<x[row].length; column++) {
				if ( row % 2 == 0 ) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			
			System.out.println();
		}
	}
	
	public static void patternCheckered(int x[][]) {
		for(int row=0; row<x.length; row++) {
			for(int column=0; column<x[row].length; column++) {
				
				if (row % 2 == 0) {
					if (column % 2 == 0) {
						System.out.print("0");
					} else {
						System.out.print("1");
					}
				}
				
				if (row % 2 == 1) {
					if (column % 2 == 0) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
				}
			}
			
			System.out.println();
		}
	}
	
	public static void userChoice(int x[][]) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter three numbers to insert into the two-dimensional array.");
		
		System.out.print("Please enter your choice: ");
		int firstNumber = userInput.nextInt();
		
		System.out.print("Please enter your choice: ");
		int secondNumber = userInput.nextInt();
		
		System.out.print("Please enter your choice: ");
		int thirdNumber = userInput.nextInt();
		
		for(int row=0; row<x.length; row++) {
			for(int column=0; column<x[row].length; column++) {
				if (row == 0 || row == 3 || row == 6 || row == 9) {
					if (column == 0 || column % 3 == 0) {
						System.out.print(firstNumber);
					} else if (column == 1 || column == 4 || column == 7) {
						System.out.print(secondNumber);
					} else {
						System.out.print(thirdNumber);
					}
				}
				
				if ( row == 1 || row == 4 || row == 7 ) {
					if (column == 0 || column % 3 == 0) {
						System.out.print(secondNumber);
					} else if (column == 1 || column == 4 || column == 7) {
						System.out.print(thirdNumber);
					} else {
						System.out.print(firstNumber);
					}
				}
				
				if ( row == 2 || row == 5 || row == 8 ) {
					if (column == 0 || column % 3 == 0) {
						System.out.print(thirdNumber);
					} else if (column == 1 || column == 4 || column == 7) {
						System.out.print(firstNumber);
					} else {
						System.out.print(secondNumber);
					}
				}
			}
			
			System.out.println();
		}
	}
}
