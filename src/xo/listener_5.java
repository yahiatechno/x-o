package xo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class listener_5 implements ActionListener{
	
	ImageIcon test = new ImageIcon("C://Users/User/eclipse-workspace/xo/src/xo/x.png");

	
	@Override
	 public void actionPerformed(ActionEvent event) {
		
		JButton btn = (JButton)event.getSource();
		btn.setIcon(test);
		 
	 }//end actionPerformed

}// end class
