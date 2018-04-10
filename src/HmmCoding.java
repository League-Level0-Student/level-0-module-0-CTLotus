import javax.swing.JOptionPane;

public class HmmCoding {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Do you know how to code?");
	String Yes = JOptionPane.showInputDialog("");
	
	if(Yes.equals("Yes")){
		JOptionPane.showMessageDialog(null, "You will rule the world!");
	}else {
		JOptionPane.showMessageDialog(null, "Go practice mopping the floors!");
	}
}
}
