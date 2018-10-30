import java.time.LocalDate;
import java.awt.*;
import java.awt.event.*;
public class BY2A extends Frame implements ActionListener {
	private Label ln,ly,la ;
	private TextField tn, ty;
	private Button exit;
	private LocalDate today;
	private int birthYear;
	private int year;
	private void init() {
		setTitle( "Your Age");
		setLayout ( null );
		setSize (380,250);
		today = LocalDate.now();
		year = today.getYear();
		ln = new Label ("Full Name");
		ly = new Label ("Year of birthday");
		la = new Label();
		tn = new TextField();
		ty = new TextField();
		exit = new Button ("Exit");
}
private void addComponent() {
	ln.setBounds (50,50,120,30);
	ly.setBounds (50,100,120,30);
	la.setAlignment (Label.CENTER);
	tn.setBounds (170,50,150,30);
	ty.setBounds (170,100,150,30);
	la.setBounds (35,150,300,30);
	exit.setBounds (135,200,100,30);
	add(ln); 
	add(tn);
	add(ly);
	add(ty); 
	add(la);
	add(exit);
	ty.addActionListener (this );
	tn.addActionListener(this);
	exit.addActionListener (this);
	addWindowListener ( new WindowAdapter() {
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
public void actionPerformed (ActionEvent e) {
	if(e.getSource() == exit )
		System.exit(1);
	else if (e.getSource() == ty){
		birthYear = Integer.parseInt (ty.getText() );
		la.setText (tn.getText() + " is " + (year-birthYear) + " years old.");
}
}
BY2A(){
	init();
	addComponent ();
	setVisible (true);
}
public static void main (String[] args){
	new BY2A();
}
}