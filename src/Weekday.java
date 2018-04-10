import javax.swing.JOptionPane;

public class Weekday {
public static void main(String[] args) {
	String weekday = JOptionPane.showInputDialog("Is today a weekday?");
	
	if(weekday.equals("Yes")){
		String vacation = JOptionPane.showInputDialog("Are you on vacation?");
		if (vacation.equals("Yes")){
			JOptionPane.showMessageDialog(null, "You can sleep in.");
		}else if(vacation.equals("No")) {
			JOptionPane.showMessageDialog(null, "Wake up!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Speak duh Engrish!");
		}
			if (weekday.equals("No")) {
				JOptionPane.showMessageDialog(null, "You can sleep in");
			}
		
	}
}
}
