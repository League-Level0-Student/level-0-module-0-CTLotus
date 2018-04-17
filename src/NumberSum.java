import javax.swing.JOptionPane;

public class NumberSum {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Give me a number");
	int number01 = Integer.parseInt(number);
	String number2 = JOptionPane.showInputDialog("Give me another number");
	int number02 = Integer.parseInt(number2);
	int sum = number01 + number02;
	
	JOptionPane.showMessageDialog(null, sum);
}
}
