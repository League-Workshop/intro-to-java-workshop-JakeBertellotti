package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showInputDialog("If you find yourself having to cross a piranha-infested river, here's how to do it");
		// Get the user to enter an adjective
		String s = JOptionPane.showInputDialog("Give an adjective");
		System.out.println(s);
		// Get the user to enter a type of liquid
		String x = JOptionPane.showInputDialog("give a type of liquid");
		System.out.println(x);
		// Get the user to enter a body part
		String y = JOptionPane.showInputDialog("Give a body part");
		// Get the user to enter a verb
			String z = JOptionPane.showInputDialog("enter a verb");
		// Get the user to enter a place
					String p = JOptionPane.showInputDialog("enter a place");
		
					
					// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more" + s + "(during the day, so cross the river at night./n");
		JOptionPane.showMessageDialog(null,"Piranhas are attracted to fresh" + x + "and will most likely take a bite out of your"+ y + "if you" + z + "");
		JOptionPane.showMessageDialog(null,"Whatever you do, if you have an open wound, try to find another way to get back to the" + p + "Good luck!");
			

	}
}

