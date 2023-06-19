/* The Application will take input and convert to degrees Celsius to Fahrenheit.
 * Author: Sean Manamela
 * Date:23-03-2023
 * Version:1.0
 * 
 */

package hello;

import javax.swing.JFrame;
import javax.swing.JOptionPane; //import JOptionPane class to allow us to use input boxes and show message boxes

public class celsius {

	public static void main(String[] args) {
		// Declaration of string variables


		int iOption;
		String sOption,sCels;
		double dCels,answer;
		
		//Calling window 1 class
		window1 display = new window1();// create a new window class
		
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); //Window will terminate when we close the window
		display.setSize(600, 200);
		display.setVisible(true);
		
		

		do{ //The Application will loop until 1 or 2 is entered
		
		sOption = JOptionPane.showInputDialog("Enter 1 to convert degree Celsius or 2 to convert to Fahrenheit"); //Prompt user to enter String value in Inputbox
		
		//Parse string to integer  
		iOption = Integer.parseInt(sOption); 
		if (iOption ==1) {
			
			//Converting string variable to a double data type
		    sCels = JOptionPane.showInputDialog("Enter degrees Fahrenheit");
			dCels = Double.parseDouble(sCels); 
			
			answer = (dCels * 5/9) -32;
			
			// Display Calculation answer to user
			JOptionPane.showMessageDialog(null, sCels + " degrees Fahrenheit is equal to " + answer +" degrees Celsius ", "Answer", JOptionPane.PLAIN_MESSAGE);
			
		}else if (iOption ==2)
			
		{
		     sCels = JOptionPane.showInputDialog("Enter degrees Celsius");

			 dCels = Double.parseDouble(sCels);

			 answer =(dCels *9/5) + 32;
			
			 JOptionPane.showMessageDialog(null, sCels + " Degree celsius is equal to  " + answer +  " degrees farenheit ", "Answer", JOptionPane.PLAIN_MESSAGE);	
		}else {
			
			//Displays Message for the user to enter a number in the range of 1-2
		    JOptionPane.showConfirmDialog(null, " Please enter 1 or 2 ", " Warning! ", JOptionPane.PLAIN_MESSAGE);
		    };
	}
		// This will check the condition of the value to be entered if is greater
		while(iOption >2 || iOption <1);
		
		
	 }
	
	
	
	
}
	
	

	

