import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot C = new Robot();
	C.setSpeed(50);
	C.penDown();
	
	C.turn(270);
	C.move(150);
	C.turn(-90);
	C.move(150);
	C.turn(-90);
	C.move(150);
	
	C.penUp();
	C.move(150);
	C.penDown();
	C.turn(-90);
	C.move(150);
	C.turn(-90);
	C.move(100);
	C.turn(180);
	C.move(200);
	
		
}

}
