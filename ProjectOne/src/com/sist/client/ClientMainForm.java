package com.sist.client;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClientMainForm extends JFrame implements ActionListener {

	Login login = new Login();
	WaitingRoom wr = new WaitingRoom();
	CardLayout card = new CardLayout();
	GameRoom gr = new GameRoom();

	// Add
	MakeRoom mr = new MakeRoom();

	ClientMainForm() {
		setLayout(card);
		add("Log", login);
		add("WR", wr);
		add("GR", gr);
		setSize(1100, 600);
		setVisible(true);
		
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		wr.b2.addActionListener(this);
		wr.b1.addActionListener(this); // 방만들기

		mr.b1.addActionListener(this); // 방만들기
		mr.b2.addActionListener(this); // 방만들기 취소
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == login.b1) {
			String id = login.tf1.getText().trim();
			if (id.length() < 1) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요.");
				login.tf1.requestFocus();
		
			}
			String pw = login.pf.getText().trim();
			if (pw.length() < 1) {
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요.");
				login.pf.requestFocus();
				return;
			}
			String gender="";
			if((id.equals("admin") && pw.equals("1234")) ||(id.equals("admin1") && pw.equals("1234")) ){
				card.show(getContentPane(), "WR");
			}else{
				JOptionPane.showMessageDialog(this, "아이디 혹은 비밀번호가 틀립니다.");
				return;
			}
		}

		// add 방만들기 창
		else if (e.getSource() == wr.b1) {
			mr.tf.setText("");
			mr.rb1.setSelected(true);
			mr.pf.setText("");
			mr.pf.setVisible(false);
			mr.la3.setVisible(false);
			mr.box.setSelectedIndex(0);
			for (int i = 0; i < 235; i++) {
				mr.setBounds(300, 0, 240, i);
				mr.setVisible(true);
			}
			mr.tf.requestFocus();
		}
		// 방 만들기 요청
		else if (e.getSource() == mr.b1) {
			// 방이름
			String rname = mr.tf.getText().trim();
			if (rname.length() < 1) {
				// 강제 입력
				JOptionPane.showMessageDialog(this, "방 이름을 입력하세요");
				mr.tf.requestFocus();
				return;
			}
System.out.println();
			// 중복 체크
			String temp = "";
			for (int i = 0; i < wr.model1.getRowCount(); i++) {
				wr.model1.getValueAt(i, 0).toString();
				if (rname.equals(temp)) {
					// 이미 존재하는 방이름이라면
					JOptionPane.showMessageDialog(this, "이미 만들어진 방입니다. \n 다시 입력하세요.");
					mr.tf.setText("");
					mr.tf.requestFocus();
					return;
				}
			}

			String state = "", pwd = "";
			if (mr.rb1.isSelected()) {// 공개
				state = "공개";
				pwd = "";
			} else {
				state = "비공개";
				pwd = new String(mr.pf.getPassword());
				if (pwd.length() < 1) {
					JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요.");
					return;
			}
			}
			// 인원
			int inwon = mr.box.getSelectedIndex() + 2;
			// 입력된 데이터 서버로 전송
			// .................
			String[] list = {rname, state, Integer.toString(inwon)};
			
			wr.model1.addRow(list);
			mr.setVisible(false);
			
			card.show(getContentPane(), "GR");
			
			/*
			 * IO, Thread, Network, SQL ==> CheckException
			 */
			
		}

		else if (e.getSource() == mr.b2) {
			System.exit(0);
		}

		else if (e.getSource() == login.b2) {
			System.exit(0);
		}
		
		//방들어가기
		else if(e.getSource()==wr.b2){
			System.out.println(wr.table1.getSelectedRow());
			
		}

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		new ClientMainForm();
	}
}