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
		
	
	//��������
	JFrame frm=new JFrame();
	frm.setTitle("ӰƬ��Ϣ");
	frm.setLayout(new BorderLayout());
	JTextArea textArea=new JTextArea();
	textArea.setLineWrap(true);
	textArea.setColumns(10);
	textArea.setRows(3);
	textArea.append("1.������� 10Ԫ "+"\n"
			      + "2.�����ӻ����� 10Ԫ"+"\n"
			      + "3.�����ڶ��� 10Ԫ"+"\n"
			      + "4.����Ȼ�Ƕ��� 10Ԫ"+"\n"
			      + "5.����ȸ�� 20Ԫ"+"\n"
			      + "6.������־�� 20Ԫ"
			      );

	textArea.setBounds(300,5,120,60);
	frm.getContentPane().add(textArea);
	
	
	frm.setBounds(400,200,400,200);
	frm.setVisible(true);
	

}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
}

	

