import javax.swing.JOptionPane;

public class IntroToInputOutput {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Pew");
		String QuestionMark = JOptionPane.showInputDialog("Enter how many pew you can do.");
		JOptionPane.showMessageDialog(null, "Wow!" + QuestionMark + "is ok!");
		System.out.println(QuestionMark);
	}
}


/*ShortCuts
	jop ctrl+ space -> JOptionPane. 
	syso ctrl+space -> System.out.print("message");
*/