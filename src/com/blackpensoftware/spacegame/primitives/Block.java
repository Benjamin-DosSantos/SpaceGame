package com.blackpensoftware.spacegame.primitives;

import java.awt.Color;
import java.awt.Graphics2D;

public class Block {

	public static void drawBlock(Graphics2D g2d, int xPos, int yPos, int width, int height, Color drawColor) {
		g2d.setColor(drawColor);
		g2d.fillRect(xPos, yPos, width, height);
	}// End of drawBlock
}// End of class