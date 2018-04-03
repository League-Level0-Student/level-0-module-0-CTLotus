import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Random {
public static void main(String[] args) {
	Robot Z = new Robot();
	Z.setSpeed(50);
	Z.setX(300);
	Z.setY(200);
	
	
	Z.penDown();
	Z.turn(180);
	Z.move(200);
	Z.turn(180);
	Z.move(100);
	Z.turn(90);
	Z.move(100);
	Z.turn(-90);
	Z.move(100);
	Z.turn(180);
	Z.move(200);
	Z.turn(180);
	Z.move(100);
	Z.turn(90);
	Z.penUp();
	Z.move(100);
	Z.turn(-90);
	Z.penDown();
	Z.move(100);
	Z.turn(180);
	Z.move(200);
}
}
