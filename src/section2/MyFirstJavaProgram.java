package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot bb8= new Robot("batman");
		bb8.sparkle();
		bb8.setSpeed(500);
		bb8.penDown();
		for(int i = 0; i < 4; i++ ) { bb8.move(100);
		bb8.turn(90);
			
		}
		
		

		
	
	
		
		
	}
}
