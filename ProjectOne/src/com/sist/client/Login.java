package com.sist.client;


import java.awt.*;
import javax.swing.*;

public class Login extends JPanel {
   
   
   
   JLabel la1,la2;
   JTextField tf1;
   JPasswordField pf;
   JButton b1,b2;
   Image img;
   

   
   Login(){
      img=Toolkit.getDefaultToolkit().getImage(".\\image\\zootopiamain.jpg");
      //이미지초기화
      setLayout(null);
   
      la1=new JLabel("ID");
      la2=new JLabel("PW");
      
      
      tf1=new JTextField();
      pf=new JPasswordField();
      
      b1=new JButton("login");
      b2=new JButton("cancel");   
      
      //배치
      //ID
      
      Font font1 = new Font(null, Font.BOLD, 20);
      la1.setBounds(610, 392, 40, 30);
      la1.setForeground(Color.black);
      la1.setFont(font1);
      tf1.setBounds(640,390 , 155, 30);
      
      //PW
      
      Font font2 = new Font(null, Font.BOLD, 20);
      la2.setBounds(600, 422, 40, 30);
      la2.setFont(font2);
      la2.setForeground(Color.black);
      pf.setBounds(640, 424, 155, 30);
      
      
      /*JPanel p1=new JPanel();
      p1.setLayout(null);
      p1.setBounds(410,370,320,85);
      p1.setBackground(new Color(61, 183, 204));*/
      
      
      
      JPanel p=new JPanel();
      p.setLayout(new GridLayout(2,1,0,5));
      p.add(b1);
      p.add(b2);
      p.setBounds(800,390,110,65);
      p.setOpaque(false);//투명도
      
      add(la1);
      add(tf1);
      add(la2);
      add(pf);
      
      
      add(p); //제이패널만 에드하면 다 따라옴
      //add(p1);
   }//여기까지생성자



   @Override
   protected void paintComponent(Graphics g) {
      g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
   }

}
