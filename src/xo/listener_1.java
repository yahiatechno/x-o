package xo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Component;

public class listener_1 implements ActionListener{
	
	ImageIcon test = new ImageIcon("C://Users/User/eclipse-workspace/xo/src/xo/x.png");
	JButton array[][];
	
	public listener_1(JButton a[][]){
		this.array = a;
	}//end listener_1
	
	@Override
	 public void actionPerformed(ActionEvent event) {
		
		JButton btn = (JButton) event.getSource();
		btn.setName("x");
		btn.setIcon(test);
		checkXResult();
	 }//end actionPerformed
		
	
	public void checkXResult() {
		     if (array[0][0].getName() == "x" && array[0][1].getName() == "x" && array[0][2].getName() == "x") 
			System.out.print("win");
		else if (array[1][0].getName() == "x" && array[1][1].getName() == "x" && array[1][2].getName() == "x")
			System.out.print("win");
		else if (array[2][0].getName() == "x" && array[2][1].getName() == "x" && array[2][2].getName() == "x") 
			System.out.print("win");
		else if (array[0][0].getName() == "x" && array[1][0].getName() == "x" && array[2][0].getName() == "x")
			System.out.print("win");
		else if (array[0][1].getName() == "x" && array[1][1].getName() == "x" && array[2][1].getName() == "x") 
			System.out.print("win");
		else if (array[0][2].getName() == "x" && array[1][2].getName() == "x" && array[2][2].getName() == "x")
			System.out.print("win");
		else if (array[0][0].getName() == "x" && array[1][1].getName() == "x" && array[2][2].getName() == "x")
			System.out.print("win");
		else if (array[0][2].getName() == "x" && array[1][1].getName() == "x" && array[2][0].getName() == "x")
			System.out.print("win");
	}// end checkResult
	
	public void printArray() {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				
			}//end for
		}// end outer for 
	}//end pcTurn
}// end class
