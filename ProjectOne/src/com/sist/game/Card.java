package com.sist.game;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Card implements ActionListener, Runnable
{
	private JPanel j;
	private Image img;
	private Image img2;
	private JButton[] bt;
	private int count = 0;
	private String chstr1, chstr2;
	private Card1 c1, c2;
	private int a = 0;
	public static int Opensu;
	public static int[] array = new int[16];
	Thread t; // Action Listener와 Runnable 인터페이스 사용
	// RUnnable 인터페이스는 스레드를 생성하기 위한 다른 방법으로 인터페이스를 구현하는 Class를 선언
	// Runnable 인터페이스의 run[] 메서드를 구현하는 Class 선언

/*	public boolean isHol() { // 변수값과 이름 설정, 배열 생성
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += 1;
		}
		if (sum % 2 == 0) {
			return false;
		}
		return true;
	} // i가 0부터 시작, 배열 길이보다 작을때까지 증가 나누기2의 나머지가 0이면 false
*/
	Card(JPanel j) {
		img = Toolkit.getDefaultToolkit().getImage("img\\뒷면.png");
		img2 = img.getScaledInstance(196, 140, Image.SCALE_REPLICATE);
			this.j = j;
//		}
	}

	public static int isWin() {
		int su = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				su++;
			}
		}
		return su;
	} // su가 0부터 시작 for문으로 배열보다 작을때까지 돌리고 배열 i가 1이면
		// su가 증가하고 아닐경우 그 값이 반환되는 형식

	public static void ifs(int a) {

		if (array[a] == 0) {
			if (array[a] == 0) {
				Opensu++;
				array[a] = 1;
			}
		}
	}

	public static void checkWin(Card1 c) {
		if (c instanceof Card16) { // instanceof연산자는 형 변환해주는 연산자
			ifs(0);
		} else if (c instanceof Card15) {
			ifs(1);
		} else if (c instanceof Card14) {
			ifs(2);
		} else if (c instanceof Card13) {
			ifs(3);
		} else if (c instanceof Card12) {
			ifs(4);
		} else if (c instanceof Card11) {
			ifs(5);
		} else if (c instanceof Card10) {
			ifs(6);
		} else if (c instanceof Card9) {
			ifs(7);
		} else if (c instanceof Card8) {
			ifs(8);
		} else if (c instanceof Card7) {
			ifs(9);
		} else if (c instanceof Card6) {
			ifs(10);
		} else if (c instanceof Card5) {
			ifs(11);
		} else if (c instanceof Card4) {
			ifs(12);
		} else if (c instanceof Card3) {
			ifs(13);
		} else if (c instanceof Card2) {
			ifs(14);
		} else if (c instanceof Card1) {
			ifs(15);
		} // A instanceof B일 경우 일반적으로 instanceof 연산자는
			// 객체 A가 B클래스나 인터페이스에 의해서 생성된 객체인지 아닌지를
			// 판단해서 참이면 true 거짓이면 false를 리턴
	}
	class Card1 extends JButton {// JButton을 상속하는 Card1클래스
		Image innerImg; // 이미지 생성
		String str; // 문자열 생성
		boolean isOpen; // open됐는지 확인 설정
		boolean isUp; // up 됐는지 확인을 설정
		int ID; // id 설정

		public int getID() {
			return ID; // ID값을 반환
		}

		public void setID(int id) {
			ID = id;// ID값을 설정
		}

		public void setB() {
			isOpen = true; // open 됐는지 확인
		}

		public boolean getB() {
			return isOpen; // open값을 반환
		}

		Card1(Image i, String str) {
			this.str = str;
			innerImg = i; // 카드에 문자열과 이미지 설정

			ImageIcon ii = new ImageIcon(img2); // 이미지 틀 생성
			this.setIcon(ii); // 레이아웃 배치 설정
		}

		Card1() {
			ImageIcon ii = new ImageIcon(img2);
			// 이미지 틀 생성
			this.setIcon(ii); // 레이아웃 배치 설정
		}

		public void changeImg() {// 이미지 변경 함수
			ImageIcon ii = new ImageIcon(innerImg); // 이미지틀 생성
			this.setIcon(ii);// 레이아웃 배치 설정
		}

		public String getStr() {// 문자열 반환
			return str;
		}

		public void defaults() { // defaults 함수 설정
			ImageIcon ii = new ImageIcon(img2); // 이미지 생성 // 다시 뒤집을떄 받는값??
			this.setIcon(ii);// 레이아웃 배치 설정
		}
	}

	class Card2 extends Card1 { // 1부터 16까지 16장의 카드 생성, 모든 카드는 카드1을 상속받아 생성한다
		Card2(Image i, String str) {
			super(i, str); // card1의 생성자 호출
		}
	}

	class Card3 extends Card1 {

		Card3(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card4 extends Card1 {

		Card4(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card5 extends Card1 {

		Card5(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card6 extends Card1 {

		Card6(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card7 extends Card1 {

		Card7(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card8 extends Card1 {

		Card8(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card9 extends Card1 {

		Card9(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card10 extends Card1 {

		Card10(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card11 extends Card1 {

		Card11(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card12 extends Card1 {

		Card12(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card13 extends Card1 {

		Card13(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card14 extends Card1 {

		Card14(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card15 extends Card1 {

		Card15(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	class Card16 extends Card1 {

		Card16(Image i, String str) {
			super(i, str); // Card1의 생성자 호출
		}
	}

	public void addButton() {
		Image[] array = new Image[16]; // 16개의 이미지 배열 생성
		bt = new JButton[16]; // 16개의 버튼 생성
		String[] str = new String[] { // String 배열 생성
				"Img\\1.jpg", "Img\\2.jpg", "Img\\2.jpg", "Img\\3.jpg", "Img\\4.jpg", "Img\\4.jpg",
				"Img\\5.jpg", "Img\\3.jpg", "Img\\6.jpg", "Img\\5.jpg", "Img\\1.jpg", "Img\\8.jpg",
				"Img\\6.jpg", "Img\\7.jpg", "Img\\7.jpg", "Img\\8.jpg" }; // 이미지
																							// 주소값

		for (int i = 0; i < 16; i++) { // 0부터 15까지
			Image innerImg = Toolkit.getDefaultToolkit().getImage(str[i]);// 위에서
																			// 선언한
																			// 배열
																			// str[]에
																			// 저장된
																			// 16개의
																			// 이미지
																			// 주소값으로
																			// 이미지를
																			// 불러옴
			Image img3 = innerImg.getScaledInstance(196, 140, Image.SCALE_SMOOTH);// 이미지의
																					// 크기
																					// 및
																					// 화질
																					// 설정
			switch (i) {
			case 0:
				bt[i] = new Card1(img3, str[i]); // i가 0인 경우 bt[0]은 str[0]값의
													// 이미지를 가진다.
				break;
			case 1:
				bt[i] = new Card2(img3, str[i]); // i가 1인 경우 bt[1]은 str[1]값의
													// 이미지를 가진다.
				break;
			case 2:
				bt[i] = new Card3(img3, str[i]); // i가 1인 경우 bt[2]은 str[2]값의
													// 이미지를 가진다.
				break;
			case 3:
				bt[i] = new Card4(img3, str[i]); // i가 3인 경우 bt[3]은 str[3]값의
													// 이미지를 가진다.
				break;
			case 4:
				bt[i] = new Card5(img3, str[i]); // i가 4인 경우 bt[4]은 str[4]값의
													// 이미지를 가진다.
				break;
			case 5:
				bt[i] = new Card6(img3, str[i]); // i가 5인 경우 bt[5]은 str[5]값의
													// 이미지를 가진다.
				break;
			case 6:
				bt[i] = new Card7(img3, str[i]); // i가 6인 경우 bt[6]은 str[6]값의
													// 이미지를 가진다.
				break;
			case 7:
				bt[i] = new Card8(img3, str[i]); // i가 7인 경우 bt[7]은 str[7]값의
													// 이미지를 가진다.
				break;
			case 8:
				bt[i] = new Card9(img3, str[i]); // i가 8인 경우 bt[8]은 str[8]값의
													// 이미지를 가진다.
				break;
			case 9:
				bt[i] = new Card10(img3, str[i]); // i가 9인 경우 bt[9]은 str[9]값의
													// 이미지를 가진다.
				break;
			case 10:
				bt[i] = new Card11(img3, str[i]); // i가 10인 경우 bt[10]은 str[10]값의
													// 이미지를 가진다.
				break;
			case 11:
				bt[i] = new Card12(img3, str[i]); // i가 11인 경우 bt[11]은 str[11]값의
													// 이미지를 가진다.
				break;
			case 12:
				bt[i] = new Card13(img3, str[i]); // i가 12인 경우 bt[12]은 str[12]값의
													// 이미지를 가진다.
				break;
			case 13:
				bt[i] = new Card14(img3, str[i]); // i가 13인 경우 bt[13]은 str[13]값의
													// 이미지를 가진다.
				break;
			case 14:
				bt[i] = new Card15(img3, str[i]); // i가 14인 경우 bt[14]은 str[14]값의
													// 이미지를 가진다.
				break;
			case 15:
				bt[i] = new Card16(img3, str[i]); // i가 15인 경우 bt[15]은 str[15]값의
													// 이미지를 가진다.
				break;
			}
		}
//		for (int ii = 0; ii < 1; ii++) {
			for (int j = 0; j < 16; j++) {
				int random = (int) (Math.random() * 16); // 0~16 난수 생성
				JButton temp = bt[j];
				bt[j] = bt[random];
				bt[random] = temp; // 버튼 bt를 랜덤하게 설정
			}
//		}
		for (int k = 0; k < 16; k++) {
			bt[k].addActionListener(this);
			j.add(bt[k]);
		}
	}

	private Card1 ins(JButton b) {
		if (b instanceof Card1) { // b가 card1인지 확인
			Card1 c = (Card1) b;
			c.setID(1);
			return c;
		}
		if (b instanceof Card2) { // b가 card1인지 확인
			Card2 c = (Card2) b;
			c.setID(2);
			return c;
		}
		if (b instanceof Card3) { // b가 card1인지 확인
			Card3 c = (Card3) b;
			c.setID(3);
			return c;
		}
		if (b instanceof Card4) { // b가 card1인지 확인
			Card4 c = (Card4) b;
			c.setID(4);
			return c;
		}
		if (b instanceof Card1) { // b가 card1인지 확인
			Card5 c = (Card5) b;
			c.setID(5);
			return c;
		}
		if (b instanceof Card6) { // b가 card1인지 확인
			Card6 c = (Card6) b;
			c.setID(6);
			return c;
		}
		if (b instanceof Card7) { // b가 card1인지 확인
			Card7 c = (Card7) b;
			c.setID(7);
			return c;
		}
		if (b instanceof Card8) { // b가 card1인지 확인
			Card8 c = (Card8) b;
			c.setID(8);
			return c;
		}
		if (b instanceof Card9) { // b가 card1인지 확인
			Card9 c = (Card9) b;
			c.setID(9);
			return c;
		}
		if (b instanceof Card10) { // b가 card1인지 확인
			Card10 c = (Card10) b;
			c.setID(10);
			return c;
		}
		if (b instanceof Card11) { // b가 card1인지 확인
			Card11 c = (Card11) b;
			c.setID(11);
			return c;
		}
		if (b instanceof Card12) { // b가 card1인지 확인
			Card12 c = (Card12) b;
			c.setID(12);
			return c;
		}
		if (b instanceof Card13) { // b가 card1인지 확인
			Card13 c = (Card13) b;
			c.setID(13);
			return c;
		}
		if (b instanceof Card14) { // b가 card1인지 확인
			Card14 c = (Card14) b;
			c.setID(14);
			return c;
		}
		if (b instanceof Card15) { // b가 card1인지 확인
			Card15 c = (Card15) b;
			c.setID(15);
			return c;
		}
		if (b instanceof Card16) { // b가 card1인지 확인
			Card16 c = (Card16) b;
			c.setID(1);
			return c;
		}
		return new Card1();
	}

	@Override // @Override가 붙으면 컴파일러는 이메소드(ex:open())와 같은 이름을
	// 가진 부모클래스의 메소드를 검색함
	public synchronized void actionPerformed(ActionEvent e) {
		t = new Thread(this);
		if (a < 2) {
			if (count <= 2) {
				count++;
				for (int i = 0; i < bt.length; i++) {
					if (e.getSource() == bt[i]) {
						Card1 c = this.ins(bt[i]);
						c.changeImg();

						if (count == 1) {
							chstr1 = c.getStr();
							c1 = c;
						} else if (count == 2) {
							chstr2 = c.getStr();
							c2 = c;
						} // 카드를 뒤집은 횟수가 2번 이하일 경우 i가 bt의 길이보다 작은 경우에만
					} // 마우스 커서로 처음 클릭한 것을 c1에, 두번째 클릭을 c2에 저장하고 카드를 뒤집어줌
				} // for 끝
				if (a == 1) {
					a = 3;
					t.start();
				} // 카드 두개가 뒤집어 지면 다시 되돌려 놓음(카드가 서로 틀릴 경우)
				a++;
			} // 바깥 if문 끝
		}
	}

	@Override
	public void run() {
		count = 2;

		try {
			Thread.sleep(500);
			; // 시간지연
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 카드 하나가 뒤집어지면 시간지연을 주어서 다음 카드를 뒤집는 사건을 동시에 발생가능하게 함
		if (count == 2) {
			if (chstr1.equals(chstr2) && (c1 == c2)) {
				count--;
				a -= 3;
				System.out.println(count + " " + a);
				return;
			}
			if (!(chstr1.equals(chstr2)) || c2 == c1) {
				if (c1.getB() == false && c2.getB() == false) {
					c1.defaults();
					c2.defaults();
				} else if (c2.getB() == false && c1.getB() == true) {
					c2.defaults();
				} else if (c2.getB() == true && c1.getB() == false) {
					c1.defaults();
				}
			} else {
				c1.setB();
				Card.checkWin(c1);
				c2.setB();
				Card.checkWin(c2);
			}
			c1 = null;
			c2 = null;
			count = 0;
			a = 0; // c1, c2횟수 초기화
		}
		if (Card.isWin() == 16) {
			JOptionPane.showMessageDialog(j, "*********게임 종료********", "Congratuation",
					JOptionPane.INFORMATION_MESSAGE);
			
		} // 뒤집어진 카드의 수가 16개이면 게임이 종료되면서 메시지 띄우기
	}
}
