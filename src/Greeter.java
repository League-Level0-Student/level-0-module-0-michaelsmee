import javax.swing.JOptionPane;
public class Greeter {
	public static void main(String[] args) {
String name= JOptionPane.showInputDialog("What is this name of yours...?");
JOptionPane.showMessageDialog(null,"Hi " + name);
	}
	
}