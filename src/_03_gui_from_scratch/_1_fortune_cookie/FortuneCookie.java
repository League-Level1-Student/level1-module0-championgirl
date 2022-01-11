package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
			Random ran = new Random();
	 public void showButton() {
         System.out.println("Button clicked");
         JFrame frame = new JFrame("The Fortune Cookie Program");
         frame.setVisible(true);
         
         JButton button = new JButton("Click for a fortune");
         frame.add(button);
     
        button.addActionListener(this);
         frame.pack();
         JOptionPane.showMessageDialog(null, "Woohoo");
	 }


         

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");


		int number = ran.nextInt(4) + 0;
			
			 
			 if (number == 0) {
					JOptionPane.showMessageDialog(null, "You will buy a new plant soon ");
				} else if (number == 1) {
					JOptionPane.showMessageDialog(null, "You will be betrayed by someone close");
				} else if (number == 2) {
					JOptionPane.showMessageDialog(null, "You will have a good day very soon...");
				} else {
					JOptionPane.showMessageDialog(null, "You will discover somthing special!");
				}	

	 }
	
	 
} //Public class end DONT REMOVE

