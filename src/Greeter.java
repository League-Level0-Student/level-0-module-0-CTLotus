import javax.swing.JOptionPane;

public class Greeter {
 public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"Hello There");
	String userName = JOptionPane.showInputDialog("What is your name?");
	
	if(userName.equals("Christ")) {
		JOptionPane.showMessageDialog(null, "Your parents have great naming idea!");
	}else {
		JOptionPane.showMessageDialog(null, "Your parents loves you");
	}
}
	 
}
