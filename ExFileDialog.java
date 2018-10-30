import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ExFileDialog extends Frame implements ActionListener{
	private Button close,open;
	private TextArea text;
	public void initialize (){
		setSize (570,430);
		setLocation (300,100);
		setLayout (new FlowLayout() );
		setBackground (Color.white);
		open = new Button ("Open");
		close= new Button ("Close");
		text = new TextArea("Open to view text");
		add(open);
		
		add(close);
		add(text);
		setResizable (false);
		open.addActionListener(this);
		close.addActionListener (this);
		
				
	}

public ExFileDialog(){
	initialize();
	setVisible(true);
}
public void actionPerformed (ActionEvent e){
		if(e.getSource() == open){
			FileDialog f = new FileDialog(this,"");
			f.setVisible(true);
			// f.setFilenameFilter(this);
			if( f.getFile() != null){
				String filename = f.getDirectory() + f.getFile();
				text.setText("");
				text.append( filename + "\n\n");
				File file = new File( filename);
				try{
					Scanner in = new Scanner(file);
					String str;
					while( in.hasNextLine() ) {
						str = in.nextLine();
						text.append(str + "\n");
					}
					in.close();
				}
				catch( FileNotFoundException ev) {
					text.append("ERROR: "+ ev + "\n");
				}
			}
		}
		if( e.getSource() == close ){
			int kq=JOptionPane.showConfirmDialog(null, "Ban co muon dong khong ?","Thong bao",JOptionPane.YES_NO_OPTION);
			if(kq==0)
			{
				System.exit(0);
			}	
		}
			
	}
public static void main (String[] args){
		new ExFileDialog();
	}
}