import javax.swing.JOptionPane;
public class Everything_is_Awesome {
public static void main(String[] args) {
String name= JOptionPane.showInputDialog("What do you like?");
JOptionPane.showInputDialog(null,"it is awesome, " + name);
}
}