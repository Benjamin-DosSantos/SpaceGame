package com.blackpensoftware.spacegame.core;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

import com.blackpensoftware.spacegame.handlers.KeyHandler;
import com.blackpensoftware.spacegame.primitives.Player;

public class SpacePanel extends JPanel {
	Random ran = new Random();
	KeyHandler keyHandler = new KeyHandler();
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, SpaceGame.screenWidth, SpaceGame.screenHeight);
		Player.drawPlayer(g2d);
		SpaceGame.mainFrame.repaint();
	}// End of paint method
}// End of class