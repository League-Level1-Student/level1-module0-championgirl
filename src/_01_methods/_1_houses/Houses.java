package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot coder = new Robot();
	public void run() {
		
		// Check the recipe to find out what code to put here
		
	   
	   	coder.setX(50);
     coder.setY(500);
     coder.setSpeed(1000);
     coder.penDown();
     
     for(int i = 0; i<=8; i++) {
    	 
  Random ran = new Random();
     int number = ran.nextInt(3) ;
     if (number==0) {
     houseDrawer("small");
     }
     else if (number==1) {
         houseDrawer("medium");
         }
     else if(number ==2) {
    	 houseDrawer("large");
     }
     }
    
     coder.hide();
     
     
	}
	void houseDrawer(String height) {
		if(height.equalsIgnoreCase("small")) {
			houseDrawer(60,Color.RED);
		}
		else if(height.equalsIgnoreCase("medium")) {
			houseDrawer(120,Color.BLUE);
			
		}
		
		else if(height.equalsIgnoreCase("large")) {
			houseDrawer(250,Color.YELLOW);
		}
		
	}
	

	
	void houseDrawer(int height) {
		
	     coder.setAngle(0);
	     coder.move(height);
	     if(height>200) {
	 		drawFlatRoof();
	 	}
	     else {
	     drawPointyRoof();}
	     
	     coder.move(height);
	     coder.setPenColor(Color.green);
	     coder.turn(-90);
	     coder.move(50);
		
	}
	
	void drawFlatRoof() {
		  coder.turn(90);
		     coder.move(50);
		     coder.turn(90);
	}
	
	void drawPointyRoof() {
		     coder.turn(45);
		     coder.move(30);
		     coder.turn(90);
		     coder.move(30);
		     coder.turn(45);
	}
	
	
	
	void houseDrawer(int height,Color color) {
		coder.setPenColor(color);
		houseDrawer(height);
	}
	
}

