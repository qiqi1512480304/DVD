package user;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;

import javax.swing.border .*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;

import javax.swing.border .*;

public class DVDAdd extends JPanel implements ActionListener{
	
		public static void main(String[] args){
		Connection con;
		
	
	//创建窗体
	JFrame frm=new JFrame();
	frm.setTitle("影片信息");
	frm.setLayout(new BorderLayout());
	JTextArea textArea=new JTextArea();
	textArea.setLineWrap(true);
	textArea.setColumns(10);
	textArea.setRows(3);
	textArea.append("1.《心理罪》 10元 "+"\n"
			      + "2.《栀子花开》 10元"+"\n"
			      + "3.《老炮儿》 10元"+"\n"
			      + "4.《怦然星动》 10元"+"\n"
			      + "5.《麻雀》 20元"+"\n"
			      + "6.《青云志》 20元"
			      );

	textArea.setBounds(300,5,120,60);
	frm.getContentPane().add(textArea);
	
	
	frm.setBounds(400,200,400,200);
	frm.setVisible(true);
	

}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
}

	

