import java.awt.*;
import java.awt.event.*;
class ListOfLanguages extends Frame implements ItemListener, ActionListener {
	private List lt;
	private Label lb;
	private Button bt;
	String pl[] = {"Java", "PHP", "C#", "C/C++", "F#", "Python", "Ruby", "Go", "Pascal", "Perl"};
	private void initialize(){
		lt = new List(pl.length/2);
		lb = new Label( "Rank of programming language");
		bt = new Button ("Close");
		setSize (270,230);
		setLocation (300,100);
		setLayout (new FlowLayout() );
		addWindowListener( new ClassExit() );
		add(new Label("TIOBE Index of Programming Language") );
		add(lt);
		add(lb);
		add(bt);
		lt.addItemListener(this);
		bt.addActionListener(this);
		for( String s: pl)
			lt.add(s);
		lt.select(0);
		lb.setAlignment(Label.CENTER);
	}
	public ListOfLanguages(){
		initialize();
		setVisible(true);
	}
	public void itemStateChanged (ItemEvent e){
		lb.setText( lt.getSelectedItem()  );
	}
	public void actionPerformed (ActionEvent e){
		System.exit(1);
	}
	public class ClassExit extends WindowAdapter {
		public void windowClosing ( WindowEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new ListOfLanguages();	
	}
}