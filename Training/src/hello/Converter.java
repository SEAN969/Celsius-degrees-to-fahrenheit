/* This is  an app to convert degrees to Celsius to degrees Fahrenheit
 * Author: Sean Manamela
 * Date: 22-03-2023
 * Revision:
 */


package hello;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// Assign a variable to the scanner
		Scanner request = new Scanner(System.in);
		System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = request.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");

	}

}
