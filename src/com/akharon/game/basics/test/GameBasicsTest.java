package com.akharon.game.basics.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.akharon.game.basics.GameBasics;

public class GameBasicsTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testcreateSprite() {
		final GameBasics game = new GameBasics();
		game.createSprite();
		assertEquals(1, game.getSizeOfSpriteList());
	}
}