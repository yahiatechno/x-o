package xo;

import javax.swing.JFrame;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;

public class XO {
	
	// creating 9 buttons  
	static JButton btn1 = new JButton();    
	static JButton btn2 = new JButton();    
	static JButton btn3 = new JButton();    
	static JButton btn4 = new JButton();
	static JButton btn5 = new JButton();    
	static JButton btn6 = new JButton();
	static JButton btn7 = new JButton();    
	static JButton btn8 = new JButton();
	static JButton btn9 = new JButton();
	
	static ArrayList<JButton> array = new ArrayList<JButton>();
	
	public static void main(String[] args) {
		JFrame frame01 = new JFrame();    	
		
		array.add(btn1);
		array.add(btn2);
		array.add(btn3);
		array.add(btn4);
		array.add(btn5);
		array.add(btn6);
		array.add(btn7);
		array.add(btn8);
		array.add(btn9);
		
		addListeners();

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
	
	public static void addListeners() {
		listener_1 listenerOne =  new listener_1(array);
		btn1.addActionListener(listenerOne);
		btn2.addActionListener(listenerOne);
		btn3.addActionListener(listenerOne);
		btn4.addActionListener(listenerOne);
		btn5.addActionListener(listenerOne);
		btn6.addActionListener(listenerOne);
		btn7.addActionListener(listenerOne);
		btn8.addActionListener(listenerOne);
		btn9.addActionListener(listenerOne);
		
	}//end addListeners
	
}//end class
