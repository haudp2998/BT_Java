import java.awt.*;
import java.awt.event.*;
class TestData extends Frame implements ActionListener {
	private Label l1,l2,l3,l4;
	private TextField tf;
	private Button bt;
	private void prepareEverything(){
		l1= new Label ("Date: ");
		
		l2= new Label ("Oct 12, 2018");
		l3= new Label ("Friday");
		l4= new Label ("Lunar year is Mau Tuat");
		tf = new TextField();
		
		bt = new Button ("Close");
		setSize(600,400);
		setLocation(200,100);
		setTitle ("My Application");
		setLayout (new FlowLayout() ) ;
		addWindowListener (new WindowAdapter() {
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		} );
		
	}
	public TestData(){
		prepareEverything();
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		tf.setBounds (250,100,150,30);
		add(tf);
		// 
		add(bt);
		
		setVisible (true);
		tf.addActionListener (this);
		bt.addActionListener (this);
	}
	public void actionPerformed (ActionEvent e){
		if(e.getSource() == bt)
			System.exit(1);
		else if( e.getSource() == tf){
			String str;
			int d,m,y;
			str = tf.getText();
			d = Integer.parseInt(str.substring(0,2) );
			m = Integer.parseInt(str.substring(3,5) );
			y = Integer.parseInt(str.substring(6,10) );
			
			ToUSDate a = new ToUSDate (d,m,y);
			l2.setText (a.getUSDate() );
			ToDayOfWeek b = new ToDayOfWeek (d,m,y);
			l3.setText (new ToDayOfWeek (d,m,y).getDayOfWeek() );
			l4.setText ( "Lunar Year is " + (new ToLunar(y).getLunarYear() ));
		}
	}
	public static void main( String[] args){
		new TestData();
	}
}