package com.blackpensoftware.spacegame.core;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.blackpensoftware.spacegame.handlers.KeyHandler;

public class SpaceGame{
	static JFrame mainFrame = new JFrame();
	
	private static final long serialVersionUID = 1L;
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Creates a Dimension for the total size of the screen
	public static int screenWidth = screenSize.width;		// Variable for the width of the screen 
	public static int screenHeight = screenSize.height;	// Variable for the height of the screen
	
	static SpacePanel spacePanel = new SpacePanel();
	static KeyHandler keyHandler = new KeyHandler();
	
	public static void main(String args[]){
		mainFrame.setSize(screenWidth, screenHeight);
		mainFrame.setVisible(true);
		spacePanel.addKeyListener(keyHandler);
		spacePanel.setFocusable(true);
		mainFrame.add(spacePanel);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// End of main method
}// End of class