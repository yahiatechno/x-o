package xo;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.ImageIcon;
import javax.swing.Icon;

public class XO {

	public static void main(String[] args) {
		JFrame frame01 = new JFrame();    
		  
		ImageIcon test = new ImageIcon("C://Users/User/eclipse-workspace/xo/src/xo/x.png");
		
		// creating 9 buttons  
		JButton btn1 = new JButton();    
		JButton btn2 = new JButton();    
		JButton btn3 = new JButton();    
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();    
		JButton btn6 = new JButton();
		JButton btn7 = new JButton();    
		JButton btn8 = new JButton();
		JButton btn9 = new JButton();
		
		btn1.setIcon(test);

		frame01.add(btn1);
		frame01.add(btn2);
		frame01.add(btn3);
		frame01.add(btn4);
		frame01.add(btn5);
		frame01.add(btn6);
		frame01.add(btn7);
		frame01.add(btn8);
		frame01.add(btn9);
		
	    frame01.setLayout(new GridLayout(3,3));    
	    frame01.setSize(600,600);    
	    frame01.setVisible(true); 
		

	}//end main

}//end class
