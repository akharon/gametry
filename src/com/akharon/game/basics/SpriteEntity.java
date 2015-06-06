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
package com.akharon.game.basics;

/**
 * @author akharon
 *
 */
public class SpriteEntity implements Sprite {
	private int verticalSpeed;
	private int horizontalSpeed;

	private int width;
	private int height;

	private int posX;
	private int posY;

	@Override
	public boolean isShown()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void draw(int x, int y) {
		setPosX(x);
		setPosY(y);
	}
	
	@Override
	public boolean collided() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @return the verticalSpeed
	 */
	public int getVerticalSpeed() {
		return verticalSpeed;
	}

	/**
	 * @param verticalSpeed the verticalSpeed to set
	 */
	public void setVerticalSpeed(int verticalSpeed) {
		this.verticalSpeed = verticalSpeed;
	}

	/**
	 * @return the horizontalSpeed
	 */
	public int getHorizontalSpeed() {
		return horizontalSpeed;
	}

	/**
	 * @param horizontalSpeed the horizontalSpeed to set
	 */
	public void setHorizontalSpeed(int horizontalSpeed) {
		this.horizontalSpeed = horizontalSpeed;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * @param posX the posX to set
	 */
	@Override
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * @param posY the posY to set
	 */
	@Override
	public void setPosY(int posY) {
		this.posY = posY;
	}


}
