/**
 * 
 */
package com.akharon.spaceinvaders;

import com.akharon.game.basics.GameBasics;

/**
 * @author mustafakyr
 *
 */
public class SpaceInvaders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameBasics game = new GameBasics();
		game.init();
		game.mainLoop();
	}
}
