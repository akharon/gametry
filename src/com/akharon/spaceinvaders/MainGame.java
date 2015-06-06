package com.akharon.spaceinvaders;

public class MainGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpaceInvaders spaceInvaders = new SpaceInvaders();
		SpaceWindow window = new SpaceWindow(); 
		SpacePhysics physics = new SpacePhysics();
		
		spaceInvaders.initPhysics(physics);
		spaceInvaders.initWindow(window);
		
		spaceInvaders.clearScreen();

		spaceInvaders.mainLoop();
		
		return;
	}
}
