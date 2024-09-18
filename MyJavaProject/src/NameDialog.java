import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) 
	
	{
		
	String name =JOptionPane.showInputDialog("What is you Name?");
	
	
	String message = String.format("Welcome, %s, to Java Programming", name);
	
	
	 JOptionPane.showInternalMessageDialog(null, message);	

	}

}