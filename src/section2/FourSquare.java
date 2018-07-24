package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot bb8 = new Robot("batman");

	void go() {
			bb8.setSpeed(500);
			bb8.penDown();
		bb8.setPenWidth(5);

		
for( int i = 0; i < 4; i++) {

			
	bb8.setRandomPenColor();
	bb8.turn(90);
			drawSquare();
	
			

	}
	}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for( int i = 0; i < 4; i++) {
		bb8.move(100);
		bb8.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



