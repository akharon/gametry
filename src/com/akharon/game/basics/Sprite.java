package com.akharon.game.basics;

public interface Sprite {
	public boolean isShown();
	public void draw(int x, int y);
	public boolean collided();
	
	public void setHeight(int height);
	public void setWidth(int width);
	
	public void setPosX(int posX);
	public void setPosY(int posY);
	
}
