package com.sist.game;
import javax.swing.JFrame;

public class Main {
	/*
	 * @param args
	*/
	public static void main(String[] args){
		JFrame f = new JFrame();
		f.add(new SecondPage());
		f.setBounds(100,100,800,600);;
		f.setVisible(true);
	}//프레임 호출
}
