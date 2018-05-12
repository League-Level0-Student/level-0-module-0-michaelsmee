package extra;

import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Knock knock.\n" + 
			"\n" + 
			"Who’s there?\n" + 
			"\n" + 
			"Mustache.\n" + 
			"\n" + 
			"Mustache who? ");
	JOptionPane.showInputDialog("what do you think the answer is?");
	JOptionPane.showMessageDialog(null, "the asnwer is,I mustache you a question, but I’ll shave it for later");
	String KnockKnock = JOptionPane.showInputDialog("what do you think the answer is?");
}

}
