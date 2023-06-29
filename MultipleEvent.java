package org.sp.app0629.event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MultipleEvent extends JFrame{
	
	JButton bt;
	JTextField t;
	JComboBox com;
	
	public MultipleEvent() {
		bt = new JButton("나버튼");
		t = new JTextField(25);
		com = new JComboBox();
		
		setLayout(new FlowLayout());//레이아웃 변경
		
		//콤보박스에 아이템 추가
		com.addItem("사과");
		com.addItem("딸기");
		com.addItem("포도");
		com.addItem("바나나");
		
		add(bt);
		add(t);
		add(com);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//버튼과 리스너 연결
		bt.addActionListener(new MyButtonListener());
		//텍스트 필드와 리스너 연결
		t.addKeyListener(new MyInputListener());
		//콤보박스와 리스너 연결
		com.addItemListener(new MyChangeListener());
		//윈도우와 리스너 연결
		this.addWindowListener(new MyWindowListener());
		
	}
	
	public static void main(String[] args) {
		new MultipleEvent();
	}
}
