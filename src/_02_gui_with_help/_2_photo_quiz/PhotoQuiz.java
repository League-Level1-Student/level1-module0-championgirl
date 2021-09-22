package _02_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€� )
String image = "https://static.wikia.nocookie.net/tangledtheseries/images/6/6d/Varian_Vertical.jpg/revision/latest/scale-to-width-down/376?cb=20180122041916";
		// 2. create a variable of type "Component" that will hold your image
 Component holder;
		// 3. use the "createImage()" method below to initialize your Component
 holder = createImage(image);
		// 4. add the image to the quiz window
quizWindow.add(holder);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String QnA = JOptionPane.showInputDialog("What is the charector's name?");

// 7. print "CORRECT" if the user gave the right answer

if(QnA.equalsIgnoreCase("Varian")) {
	
System.out.println("CORRECT");

}

else {
	System.out.println("INCORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(holder);
		// 10. find another image and create it (might take more than one line
		// of code)
 image = "http://vignette2.wikia.nocookie.net/p__/images/6/67/Tangled_-_Cassandra.png/revision/latest?cb=20170326175157&path-prefix=protagonist";

// 3. use the "createImage()" method below to initialize your Component
holder = createImage(image);
// 4. add the image to the quiz window
quizWindow.add(holder);
// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question
QnA = JOptionPane.showInputDialog("What is the charector's name?");


if(QnA.equalsIgnoreCase("Cassandra")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("Cass")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("Cassie")) {
	
System.out.println("CORRECT");

}

else {
	System.out.println("INCORRECT");
}
/////////////////////////////////////////////////////////////////////////////
quizWindow.remove(holder);
// 10. find another image and create it (might take more than one line
// of code)
image = "https://i.pinimg.com/736x/4b/2b/7a/4b2b7ae691043d882ee365cb521a4608.jpg";


holder = createImage(image);

quizWindow.add(holder);

quizWindow.pack();


QnA = JOptionPane.showInputDialog("How is Cassandra getting her power?");


if(QnA.equalsIgnoreCase("The moonstone")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("moonstone")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("She is getting her power from the moonstone")) {
	
System.out.println("CORRECT");

}

else {
	System.out.println("INCORRECT");
}
////////////////////////////////////////////////////////////////

quizWindow.remove(holder);
//10. find another image and create it (might take more than one line
//of code)
image = "https://static.wikia.nocookie.net/tangledtheseries/images/a/ad/Cass2.png/revision/latest/scale-to-width-down/446?cb=20200415113402";


holder = createImage(image);

quizWindow.add(holder);

quizWindow.pack();


QnA = JOptionPane.showInputDialog("Is Cass in this picture? ; Are these to women related? (Put a ; to seperate answers)");


if(QnA.equalsIgnoreCase("yes;yes")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("Duh;Bruh")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("YASS,sadlyYASS")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("yes,maybe")) {
	
System.out.println("CORRECT");

}

else {
	System.out.println("INCORRECT");
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

quizWindow.remove(holder);
//10. find another image and create it (might take more than one line
//of code)
image = "https://i.pinimg.com/474x/72/bd/24/72bd240dbe99e80d6badd66cf0cc0972.jpg";


holder = createImage(image);

quizWindow.add(holder);

quizWindow.pack();


QnA = JOptionPane.showInputDialog("What song is Varian singing, put spaces in ur answer, C yall this is a question abt Varian not cass in 4eva ha xD )");


if(QnA.equalsIgnoreCase("let me make you proud")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("I will make you proud")) {
	
System.out.println("CORRECT");

}

if(QnA.equalsIgnoreCase("Some proud song lol")) {
	
System.out.println("CORRECT");

}

else {
	System.out.println("INCORRECT");
	
}


		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
