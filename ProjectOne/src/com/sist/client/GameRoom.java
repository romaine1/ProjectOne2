package com.sist.client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GameRoom extends JPanel {

	JPanel gp, wp, up, cp, ep;
	JButton start, end;
	JTable table;
	DefaultTableModel model;
	JTextArea ta;
	JTextField tf;
	Image img;
	ImageIcon icon;
	
	GameRoom() {
		setLayout(null);
		
		wp = new JPanel();
		wp.setBounds(0, 0, 800, 600);
		wp.setBackground(Color.white);
		wp.setVisible(true);
		img=Toolkit.getDefaultToolkit().getImage(".\\waitimage\\main.jpg");
		
		
		gp = new JPanel();
		gp.setBounds(0, 0, 800, 600);
		gp.setBackground(Color.black);
		gp.setVisible(false);
		
		
		up = new JPanel();
		up.setBounds(800, 0, 300, 150);

		cp = new JPanel();
		cp.setBounds(800, 150, 300, 350);

		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		tf = new JTextField();
		//레이아웃 추가
		cp.setLayout(null);
		js.setBounds(5, 5, 270, 300);
		tf.setBounds(5, 310, 270, 30);
		cp.add(js);
		cp.add(tf);

		
		ep = new JPanel();
		ep.setBounds(800, 500, 300, 100);
//		GridLayout gridlayout = new GridLayout(2, 1);
		ep.setLayout(null);
		start=new JButton("시작하기");
		end=new JButton("나가기");
		start.setBounds(10, 5, 120, 40);
		end.setBounds(150, 5, 120, 40);
		ep.add(start); ep.add(end);
		
		add(gp);
		add(up);
		add(cp);
		add(ep);

	}
	   @Override
	   protected void paintComponent(Graphics g) {
	      g.drawImage(img, 0, 0, wp.getWidth(), wp.getHeight(),this);
	   }
	
}