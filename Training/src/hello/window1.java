/*This Application extends the JFram class to create a Window for the degrees  
 * 
 * 
 * 
 */



package hello;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class window1 extends JFrame {
private static final long serialVersionUID = 9000L;//Seria
	//create a label
	private JLabel title;
	
	//create constructor for window1
	
	public window1() {
		
		super ("Instructions");
		setLayout(new FlowLayout());
		title = new JLabel("<html>" + "<br><br>" + "These are the instructions, This Application will convert degrees Celsius to degrees Fahrenheit and vise versa" + "<html>");
		
		add(title);
	};
	     
}
