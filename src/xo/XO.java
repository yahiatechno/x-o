package xo;

import javax.swing.JFrame;

import java.awt.Component;
import java.awt.GridLayout;
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
	
	static JButton array[][] = {
			{btn1, btn2, btn3},
			{btn4, btn5, btn6},
			{btn7, btn8, btn9}
	};
	

	public static void main(String[] args) {
		JFrame frame01 = new JFrame();    	
		
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
