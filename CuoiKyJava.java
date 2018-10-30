import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
class CuoiKyJava extends Frame implements ItemListener, ActionListener {
	private List lt;
	private Label lb;
	private TextArea ta;
	private Button bt;
	String pl[] = {"Programming With Java","Image Processing", "PHP", "C#", "C/C++ Programming Language", "F#", "Python in Fuzzy Control", "Ruby", "Go", "Pascal", "Perl"};
	private void initialize(){
		lt = new List(pl.length/2,true);
		bt = new Button ("Close");
		ta = new TextArea();
		lb = new Label("DS");
		ta.setBounds(10, 207, 293, 157);
		lt.setBounds(10, 50, 293, 120);
		lb.setBounds(39, 175, 235, 22);
		bt.setBounds(109, 388, 70, 22);
		setBounds(100, 100, 330, 430);
		
		setLocation (300,100);
		setTitle("DK");
		setLayout (null );
		addWindowListener( new ClassExit() );
		//lt.setMultipleSelections(true);
		lt.setMultipleMode(true);
		
		add(lt);
		add(lb );
		add(ta);
		add(bt);
		
		lt.addItemListener(this);
		bt.addActionListener(this);
		for( String s: pl)
			lt.add(s);
		
		
	}
	public CuoiKyJava(){
		initialize();
		setVisible(true);
	}
	public void itemStateChanged (ItemEvent e){
		String[] item = lt.getSelectedItems();
		String tmp="";
		for(int i=0;i< item.length; i ++) {
			tmp = tmp + item[i] + "\n" ;
		}
		ta.setText( tmp  );
	}
	public void actionPerformed (ActionEvent e){
		if( e.getSource() == bt ){
			int kq=JOptionPane.showConfirmDialog(null, "Ban Co ?","Thong Bao",JOptionPane.YES_NO_OPTION);
			if(kq==0)
			{
				System.exit(0);
			}	
		}
		//System.exit(1);
	}
	public class ClassExit extends WindowAdapter {
		public void windowClosing ( WindowEvent e) {
			int kq=JOptionPane.showConfirmDialog(null, "Ban Co ?","Thong Bao",JOptionPane.YES_NO_OPTION);
			if(kq==0)
			{
				System.exit(0);
			}
			//System.exit(0);
		}
	}
	public static void main(String[] args){
		new CuoiKyJava();	
	}
}
