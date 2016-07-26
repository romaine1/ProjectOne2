package com.sist.client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class WaitingRoom extends JPanel {
	JTable table1, table2;
	DefaultTableModel model1, model2;
	JTextArea ta;
	JTextField tf;
	JComboBox box;
	JButton b1, b2, b3, b4, b5, b6;

	WaitingRoom(){
		String[][]row1=new String[0][3];
		String[] col1 = {"방이름", "공개/비공개", "인원"};

		model1 = new DefaultTableModel(row1, col1);
		table1 = new JTable(model1){ // 숫자 안 바뀌게 하는거
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		table1.getTableHeader().setResizingAllowed(false); //  이동 안되게 막는거
		
		
		table1.getTableHeader().setReorderingAllowed(false); // 이동 안되게 막는거
		
		JScrollPane js1 = new JScrollPane(table1);

		String[][]row2=new String[0][4];
		String[] col2 = {"ID", "대화명", "성별","위치"};

		model2 = new DefaultTableModel(row2, col2);
		table2 = new JTable(model2);
		table2.getTableHeader().setResizingAllowed(false);
		table2.getTableHeader().setReorderingAllowed(false);
		JScrollPane js2 = new JScrollPane(table2);
		
		ta = new JTextArea();
		JScrollPane js3 = new JScrollPane(ta);
		
		tf = new JTextField();
		
		box = new JComboBox();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("green");
		box.addItem("bcyan");
		box.addItem("pink");
		
		b1=new JButton("방만들기");
		b2=new JButton("방들어가기");
		b3=new JButton("1:1게임");
		b4=new JButton("쪽지보내기");
		b5=new JButton("정보보기");
		b6=new JButton("나가기");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2,5,5));
		p.add(b1); p.add(b2);
		p.add(b3); p.add(b4);
		p.add(b5); p.add(b6);
		
		//레이아웃 추가
		setLayout(null);
		js1.setBounds(10,15,500,350);
		js2.setBounds(10,370,500,180);
		js3.setBounds(515, 15, 265, 300);
		
		tf.setBounds(515, 320, 140, 30);
		box.setBounds(680,320, 100, 30);
		p.setBounds(515, 470,265,80);
		
		add(js1);
		add(js2);
		add(js3);
		add(tf);
		add(box);
		add(p);

	}
}