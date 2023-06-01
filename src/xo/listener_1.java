package xo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class listener_1 implements ActionListener{
	
	ImageIcon test = new ImageIcon("C://Users/User/eclipse-workspace/xo/src/xo/x.png");
	char array[][] = {
			{'1', '2', '3'},
			{'4', '5', '6'},
			{'7', '8', '9'}
	};
	
	@Override
	 public void actionPerformed(ActionEvent event) {
		
		JButton btn = (JButton) event.getSource();
		fillArray(btn.getName());
		btn.setIcon(test);
		checkResult();
		 
	 }//end actionPerformed
		
	
	public void fillArray(String buttonCharacter) {
		
		switch (buttonCharacter) {
		
		case "a":
			array[0][0] = 'x';
			break;
		
		case "b":
			array[0][1] = 'x';
			break;
		
		case "c":
			array[0][2] = 'x';
			break;
		
		case "d":
			array[1][0] = 'x';
			break;
		
		case "e":
			array[1][1] = 'x';
			break;
		
		case "f":
			array[1][2] = 'x';
			break;
		
		case "g":
			array[2][0] = 'x';
			break;
		
		case "h":
			array[2][1] = 'x';
			break;
		
		case "i":
			array[2][2] = 'x';
			break;
			
		}// end switch
	}//end fill Array
	
	public void checkResult() {
		     if (array[0][0] == array[0][1] && array[0][1] == array[0][2]) 
			System.out.print("win");
		else if (array[1][0] == array[1][1] && array[1][1] == array[1][2])
			System.out.print("win");
		else if (array[2][0] == array[2][1] && array[2][1] == array[2][2]) 
			System.out.print("win");
		else if (array[0][0] == array[1][0] && array[1][0] == array[2][0])
			System.out.print("win");
		else if (array[0][1] == array[1][1] && array[1][1] == array[2][1]) 
			System.out.print("win");
		else if (array[0][2] == array[1][2] && array[1][2] == array[2][2])
			System.out.print("win");
		else if (array[0][0] == array[1][1] && array[1][1] == array[2][2])
			System.out.print("win");
		else if (array[0][2] == array[1][1] && array[1][1] == array[2][0])
			System.out.print("win");
	}// end checkResult
	
	public void pcTurn() {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(array[i][j] != 'x' && array[i][j] != 'o')
					
			}//end for
		}// end outer for 
	}//end pcTurn
}// end class
