/**
 * 
 */
package com.akharon.game.basics;

/**
 * @author mustafakyr
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
