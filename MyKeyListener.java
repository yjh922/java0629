package org.sp.app0629.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener{


	public void keyTyped(KeyEvent e) {
			System.out.println("keyTyped 호출");
	}

	//키누룰때 js의 keydown과 비슷
	public void keyPressed(KeyEvent e) {
		//System.out.println("keyPressed 호출");
	}

	//키 눌렀다 뗄때 js의 keyup과 비슷
	public void keyReleased(KeyEvent e) {
		//System.out.println("keyReleased 호출");
	}

}
