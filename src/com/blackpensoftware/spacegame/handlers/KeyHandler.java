package com.blackpensoftware.spacegame.handlers;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	@Override
	 public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			 PlayerPosHandler.movePlayerUp();
		 }
	     if (e.getKeyCode() == KeyEvent.VK_S) {
	    	 PlayerPosHandler.movePlayerDown();
	     }
	     if (e.getKeyCode() == KeyEvent.VK_A) {
	    	 PlayerPosHandler.movePlayerLeft();
		 }
	     if (e.getKeyCode() == KeyEvent.VK_D) {
	    	 PlayerPosHandler.movePlayerRight();
	     }
	     if (e.getKeyCode() == KeyEvent.VK_SPACE) {
	    	 System.out.println("FIRE!");
	     }
	 }// End of KeyPressed

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}// End of class