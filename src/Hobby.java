import javax.swing.JOptionPane;

public class Hobby {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "So, what's your hobby?");
	String Hobby = JOptionPane.showInputDialog("");
	JOptionPane.showMessageDialog(null, "Sweet! " + Hobby + " is an awesome hobby to have.");
}
}
