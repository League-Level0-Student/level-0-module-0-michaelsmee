package extra;

import org.jointheleague.graphical.robot.Robot;

public class robotgrafitti {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(1000);
	rob.turn(25);
	rob.move(100);
	rob.turn(95);
	rob.move(100);
	rob.turn(-95);
	rob.move(100);
	rob.turn(105);
	rob.move(150);
	
}
	

}
