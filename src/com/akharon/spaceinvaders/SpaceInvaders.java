/*
 * Copyright (c) 2002-2010 JGT_MKYR Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'JGT_MKYR' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.akharon.spaceinvaders;

import java.util.Vector;

import com.akharon.game.basics.Game;
import com.akharon.game.basics.Physics;
import com.akharon.game.basics.Sprite;
import com.akharon.game.basics.Window;

/**
 * @author akharon
 *
 */
public class SpaceInvaders implements Game{
	
	private Vector<Sprite> spriteList;
	private Window window;
	private Physics physics;
	
	public SpaceInvaders()
	{
		spriteList = new Vector<Sprite>();
	}
	
	/**
	 * @param sprite the spriteList to add
	 */
	public void addSprite(Sprite sprite)
	{	
		spriteList.add(sprite);
	}
	
	/**
	 * @param sprite the spriteList to remove
	 */
	public void removeSprite(Sprite sprite)
	{	
		spriteList.remove(sprite);
	}
	
	public int getSizeOfSpriteList()
	{
		return spriteList.size();
	}
	
	@Override
	public void initWindow(Window window)
	{
		this.window = window;
		window.setFPS(0);
		window.setMessage("Hello World !");
		window.setGroundLevel(0);
		window.setScore(0);
		window.setHeight(480);
		window.setWidth(640);
	}
	
	@Override
	public void initPhysics(Physics physics)
	{
		this.physics = physics;
		physics.enableGravity();
		physics.setGravity(9);
	}
	
	@Override
	public void mainLoop() {
		// TODO Auto-generated method stub
		this.clearScreen();
		this.drawScreen();
	}

	@Override
	public void clearScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawScreen() {
		// TODO Auto-generated method stub
		
	}
}
