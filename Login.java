import java.awt.*;
import java.awt.event.*;

class Login extends Frame implements ActionListener{
	private TextField tf1, tf2;
	private Label lb1,lb2;
	private Button bt;
	private void prepare(){
		tf1 = new TextField("              ");
		tf2 = new TextField("              ");
		lb1 = new Label("Username: ");
		lb2 = new Label("Password: ");
		bt = new Button ("Sign In");
		setSize(500,300);
		setLocation(300,100);
		setLayout (new FlowLayout() );
		addWindowListener (new ClassExit() );
		add (new Label("Sign In") );
		add(lb1);
		add(tf1);
		
		add(lb2);
		add(tf2);
		
		add(bt);
	}
	Login(){
		prepare();
		setVisible(true);
	}
	class ClassExit extends WindowAdapter {
		public void windowClosing ( WindowEvent e) {
			System.exit(1);
		}
	}
	public void actionPerformed (ActionEvent e){
		
	}
	public static void main(String[] args){
		new Login();	
	}
}	