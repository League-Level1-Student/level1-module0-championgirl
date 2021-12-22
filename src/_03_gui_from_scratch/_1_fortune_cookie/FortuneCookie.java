package _03_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie {
	
	 public void showButton() {
         System.out.println("Button clicked");
         JFrame frame = new JFrame("The Fortune Cookie Program");
         frame.setVisible(true);
         
         JButton button = new JButton("Click for a fortune");
         frame.add(button);
     
        button.addActionListener((ActionListener) this);
         frame.pack();
         JOptionPane.showMessageDialog(null, "Woohoo");
	 }

	 actionPerformed(){
         JOptionPane.showMessageDialog(null, "Woohoo");

         int rand = new Random().nextInt(5);

	 }
	 
} //Public class end DONT REMOVE

