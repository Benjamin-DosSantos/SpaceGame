package com.blackpensoftware.spacegame.primitives;

import java.awt.Color;
import java.awt.Graphics2D;

import com.blackpensoftware.spacegame.handlers.PlayerPosHandler;

public class Player {
	public static int playerWidth = 10;
	public static int playerHeight = playerWidth;
	public static int playerTotalWidth = playerWidth * 5;
	public static int playerTotalHeight = playerHeight * 5;
	
	public static void drawPlayer(Graphics2D g2d){
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos(), PlayerPosHandler.getPlayerYPos(), playerWidth, playerHeight, Color.WHITE);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos(), PlayerPosHandler.getPlayerYPos() + playerHeight, playerWidth, playerHeight, Color.WHITE);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos() + playerWidth, PlayerPosHandler.getPlayerYPos() + playerHeight, playerWidth, playerHeight, Color.WHITE);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos() - playerWidth, PlayerPosHandler.getPlayerYPos() + playerHeight, playerWidth, playerHeight, Color.WHITE);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos(), PlayerPosHandler.getPlayerYPos() + (2 * playerHeight), playerWidth, playerHeight, Color.WHITE);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos() + playerWidth, PlayerPosHandler.getPlayerYPos() + (2 * playerHeight), playerWidth, playerHeight, Color.WHITE);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos() - playerWidth, PlayerPosHandler.getPlayerYPos() + (2 * playerHeight), playerWidth, playerHeight, Color.WHITE);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos() - (2 * playerWidth), PlayerPosHandler.getPlayerYPos() + (2 * playerHeight), playerWidth, playerHeight, Color.WHITE);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos() + (2 * playerWidth), PlayerPosHandler.getPlayerYPos() + (2 * playerHeight), playerWidth, playerHeight, Color.WHITE);
		
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos() - (2 * playerWidth), PlayerPosHandler.getPlayerYPos() + playerHeight, playerWidth / 3, playerHeight, Color.RED);
		Block.drawBlock(g2d, PlayerPosHandler.getPlayerXPos() + ((3 * playerWidth) - playerWidth / 3), PlayerPosHandler.getPlayerYPos() + playerHeight, playerWidth / 3, playerHeight, Color.RED);
	}// End of drawPlayer
}// End of class