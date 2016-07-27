package com.sist.game;
import java.awt.*;
import javax.swing.*;

public class SecondPage extends JPanel {
	private void init(){
		this.setLayout(new GridLayout(4,4,1,1));//gridlayout(rows cols hgap vgap)
		//row 열수 cols 행수 hgap 좌우 컴포넌트 수평간격 픽셀 vgap 상하 픽셀간격
		
		Card cc = new Card(this);
		cc.addButton();
	}
	SecondPage(){
		init(); //객체 생성
	}
	
	public JPanel getPan(){
		return this;
	}
}
