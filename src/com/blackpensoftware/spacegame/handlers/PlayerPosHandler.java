package com.blackpensoftware.spacegame.handlers;

import com.blackpensoftware.spacegame.core.SpaceGame;
import com.blackpensoftware.spacegame.primitives.Player;

public class PlayerPosHandler {
	
	static int playerXPos = 500;
	static int playerYPos = 500;
	static int increment = Player.playerTotalWidth;
	
	public static int getPlayerXPos() {
		return playerXPos;
	}
	
	public static void setPlayerXPos(int newPlayerXPos) {
		playerXPos = newPlayerXPos;
	}
	
	public static int getPlayerYPos() {
		return playerYPos;
	}
	
	public static void setPlayerYPos(int newPlayerYPos) {
		playerYPos = newPlayerYPos;
	}
	
	public static void movePlayerRight(){
		if(playerXPos < SpaceGame.screenWidth - (Player.playerTotalWidth * 2)){
			playerXPos += increment;
		}
	}
	
	public static void movePlayerLeft(){
		if(playerXPos > Player.playerTotalWidth){
			playerXPos -= increment;
		}
	}
	
	public static void movePlayerDown(){
		if(playerYPos < SpaceGame.screenHeight - (Player.playerTotalHeight * 2)){
			playerYPos += increment;
		}
	}

	public static void movePlayerUp(){
		if(playerYPos > 0){
			playerYPos -= increment;
		}
	}
}// End of class