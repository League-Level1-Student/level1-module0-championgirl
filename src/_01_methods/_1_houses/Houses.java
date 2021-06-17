package _01_methods._1_houses;

import java.awt.Color;

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
     houseDrawer(i*50+100);
     }
     coder.hide();
     
     
	}
	void houseDrawer(String height) {
		if(height.equalsIgnoreCase("small")) {
			houseDrawer(60);
		}
		else if(height.equalsIgnoreCase("medium")) {
			houseDrawer(120);
		}
		
		else if(height.equalsIgnoreCase("Large")) {
			houseDrawer(250);
		}
		
	}
	void houseDrawer(int height) {
		
	coder.setAngle(0);
		coder.setRandomPenColor();
	     coder.move(height);
	     coder.turn(90);
	     coder.move(50);
	     coder.turn(90);
	     coder.move(height);
	     coder.setPenColor(Color.green);
	     coder.turn(-90);
	     coder.move(50);
		
	}
	
}

