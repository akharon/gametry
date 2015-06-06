package com.akharon.game.basics;

import java.util.Vector;

public class GameBasics {
	
	private Vector<Sprite> spriteList;
	
	public GameBasics()
	{
		spriteList = new Vector<Sprite>();
	}
	
	public boolean init(){
		return false;
	}
	
	public void deInit()
	{
		
	}
	
	public void mainLoop()
	{
		
	}
	
	public void addSprite(Sprite sprite, int posX, int posY, int height, int width)
	{
		sprite.setPosX(posX);
		sprite.setPosY(posY);
		
		sprite.setHeight(height);
		sprite.setWidth(width);
		
		spriteList.add(sprite);
	}
	
	public int getSizeOfSpriteList()
	{
		return spriteList.size();
	}
}
