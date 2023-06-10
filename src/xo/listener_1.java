package xo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class listener_1 implements ActionListener{
	
	ImageIcon xIcon = new ImageIcon("C:/Users/Kimo Store/eclipse-workspace/x-o/src/xo/x.png");
	ImageIcon oIcon = new ImageIcon("C:/Users/Kimo Store/eclipse-workspace/x-o/src/xo/dot.png");
	ArrayList<JButton> array = new ArrayList<JButton>();
	int j;
	int i;
	
	public listener_1(ArrayList<JButton> array){
		this.array = array;
	}//end listener_1
	
	@Override
	 public void actionPerformed(ActionEvent event) {
		
		JButton btn = (JButton) event.getSource();
		btn.setName("x");
		btn.setIcon(xIcon);
		//pc turn
		pcTuren();
		checkXResult();
		checkOResult();
	 }//end actionPerformed
		
	
	public void checkXResult() {
		     if (array.get(0).getName() == "x" && array.get(1).getName() == "x" && array.get(2).getName() == "x") 
		    	 JOptionPane.showMessageDialog(null, "congratulations you are the winner");
		else if (array.get(3).getName() == "x" && array.get(4).getName() == "x" && array.get(5).getName() == "x")
			JOptionPane.showMessageDialog(null, "congratulations you are the winner");
		else if (array.get(6).getName() == "x" && array.get(7).getName() == "x" && array.get(8).getName() == "x") 
			JOptionPane.showMessageDialog(null, "congratulations you are the winner");
		else if (array.get(0).getName() == "x" && array.get(3).getName() == "x" && array.get(6).getName() == "x")
			JOptionPane.showMessageDialog(null, "congratulations you are the winner");
		else if (array.get(1).getName() == "x" && array.get(4).getName() == "x" && array.get(7).getName() == "x") 
			JOptionPane.showMessageDialog(null, "congratulations you are the winner");
		else if (array.get(2).getName() == "x" && array.get(5).getName() == "x" && array.get(8).getName() == "x")
			JOptionPane.showMessageDialog(null, "congratulations you are the winner");
		else if (array.get(0).getName() == "x" && array.get(4).getName() == "x" && array.get(8).getName() == "x")
			JOptionPane.showMessageDialog(null, "congratulations you are the winner");
		else if (array.get(2).getName() == "x" && array.get(4).getName() == "x" && array.get(6).getName() == "x")
			JOptionPane.showMessageDialog(null, "congratulations you are the winner");
	}// end checkResult
	
	public void checkOResult() {
	     if (array.get(0).getName() == "o" && array.get(1).getName() == "o" && array.get(2).getName() == "o") 
	    	 JOptionPane.showMessageDialog(null, "you lost");
	else if (array.get(3).getName() == "o" && array.get(4).getName() == "o" && array.get(5).getName() == "o")
		JOptionPane.showMessageDialog(null, "you lost");
	else if (array.get(6).getName() == "o" && array.get(7).getName() == "o" && array.get(8).getName() == "o") 
		JOptionPane.showMessageDialog(null, "you lost");
	else if (array.get(0).getName() == "o" && array.get(3).getName() == "o" && array.get(6).getName() == "o")
		JOptionPane.showMessageDialog(null, "you lost");
	else if (array.get(1).getName() == "o" && array.get(4).getName() == "o" && array.get(7).getName() == "o") 
		JOptionPane.showMessageDialog(null, "you lost");
	else if (array.get(2).getName() == "o" && array.get(5).getName() == "o" && array.get(8).getName() == "o")
		JOptionPane.showMessageDialog(null, "you lost");
	else if (array.get(0).getName() == "o" && array.get(4).getName() == "o" && array.get(8).getName() == "o")
		JOptionPane.showMessageDialog(null, "you lost");
	else if (array.get(2).getName() == "o" && array.get(4).getName() == "o" && array.get(6).getName() == "o")
		JOptionPane.showMessageDialog(null, "you lost");
}// end checkResult
	



	public void pcTuren() {
		for(JButton btn: array) {
			if(btn.getName() == null) {
				btn.getName();
				btn.setName("o");
				btn.setIcon(oIcon);
				break;
				}//end if
			}//end for
	
	}//end pcTurn
}// end class
