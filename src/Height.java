import javax.swing.JOptionPane;

public class Height {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you in inches?");
	int height2 = Integer.parseInt(height);
	if(height2 > 60) {
		JOptionPane.showMessageDialog(null, "You can ride the roller coaster!");
	}else {
		JOptionPane.showMessageDialog(null, "You cannot ride the roller coaster!");
	}
}
}
