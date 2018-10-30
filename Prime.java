
import java.awt.*;
import java.awt.event.*;

class Prime extends Frame implements ActionListener{
	private TextField tf;
	private TextArea ta;
	private Button bt;
	private void prepare(){
		tf = new TextField("              ");
		ta = new TextArea( "",12,50,TextArea.SCROLLBARS_VERTICAL_ONLY);
		bt = new Button ("Close");
		setSize(500,300);
		setLocation(300,100);
		setLayout (new FlowLayout() );
		addWindowListener (new ClassExit() );
		add (new Label("Input Data") );
		add(tf);
		add(ta);
		add(bt);
		tf.addActionListener(this);
		bt.addActionListener(this);
	}
	public Prime() {
		prepare();
		setVisible(true);
	}
	class ClassExit extends WindowAdapter {
		public void windowClosing ( WindowEvent e) {
			System.exit(1);
		}
	}
	public void actionPerformed (ActionEvent e){
		if( e.getSource() == tf){
			ta.append( tf.getText() + "\n");
			tf.setText("");}
		else
			System.exit(1);
	}
	public static void main(String[] args){
		new Prime();	
	}
}


