package com.akharon.spaceinvaders;

import com.akharon.game.basics.Window;

public class SpaceWindow implements Window{

	private int score;
	private int fps; 
	private String popUpMsg;
	
	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGroundLevel(int y) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void inputKeyHandler(int keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputMouseHandler(int mouseEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFPS(int fps) {
		// TODO Auto-generated method stub
		this.fps = fps;
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		this.popUpMsg = msg;
	}

	@Override
	public void setScore(int score) {
		// TODO Auto-generated method stub
		this.score = score;
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub 
	}
}
