import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Message extends Frame implements ActionListener{
	private Button close,yes,no;
	public void initialize (){
		setSize (270,230);
		setLocation (300,100);
		setLayout (new FlowLayout() );
		setBackground (Color.gray);
		Label label = new Label ("Tonong DHSP");
		label.setForeground (Color.white);
		close= new Button ("Dong lai");
		
		add(label);
		
		add(close);
		setSize (300,90);
		setLocation (200,100);
		setResizable (false);
		close.addActionListener (this);
		
				
	}
	
	public Message(){
		initialize();
		setVisible (true);

	}
	
	public void actionPerformed (ActionEvent e){
		if( e.getSource() == close ){
			int kq=JOptionPane.showConfirmDialog(null, "Ban co muon dong khong ?","Thong bao",JOptionPane.YES_NO_OPTION);
			if(kq==0)
			{
				System.exit(0);
			}	
		}
			
	}
	
	public static void main (String[] args){
		new Message();
	}
}