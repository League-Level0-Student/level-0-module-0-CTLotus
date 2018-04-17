import javax.swing.JOptionPane;

public class MonthofDOB {
	public static void main(String[] args) {
		String month = JOptionPane.showInputDialog("What month were you born?");
		
		if(month.equalsIgnoreCase("June")) {
			JOptionPane.showMessageDialog(null, "Wow, you're awesome!");
		}else {
			JOptionPane.showMessageDialog(null, "Ha, you're weird.");
		}
	}

}
