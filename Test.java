import java.awt.*;
import java.awt.event.*;
class Test extends Frame implements ActionListener {
	private Button close;
	private Button click;
	private Label lb;
	private void init () {
		lb = new Label ();
		click = new Button ("Click here");
		close = new Button ("Close");
		lb.setBounds (50,50,350,30);
		lb.setAlignment (Label.CENTER);
		click.setBounds (50,100,150,30);
		close.setBounds (250,100,150,30);
	}

	public Test() {
		setLayout ( new FlowLayout() );
		setSize(400, 300);
		setTitle ("This is my window");
		setVisible (true);
		addWindowListener (new WindowAdapter() {
			public void windowClosing( WindowEvent e){
				System.exit ( 0 );
				}
		} );
		init();
		add (lb);
		add (click);
		
		add( close );
		click.addActionListener (this);
		close.addActionListener (this);
			
	}
	
	public void actionPerformed (ActionEvent e){
		if( e.getSource() == click ){
			lb.setText ("Welcome to HCMUE");
		}
		else if (e.getSource() == close)
		
			System.exit(1);
	}
	

/*public void paint ( Graphics g){
	g.drawImage (Toolkit.getDefaultToolkit().getImage ("Test.png"),20,40,this);
	g.setColor (Color.black);
	g.setFont (new Font("",Font.BOLD,12) );	
	g.drawString ("Hau DP",500,455);
	g.setFont (new Font ("",Font.ITALIC,12));
	g.drawString ("HCM",470,470);

}*/
public static void main(String[] args){
		new Test();
	} 	
}