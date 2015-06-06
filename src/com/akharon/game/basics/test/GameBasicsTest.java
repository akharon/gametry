package com.akharon.game.basics.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.akharon.game.basics.GameBasics;
import com.akharon.game.basics.SpriteEntity;

public class GameBasicsTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testcreateSprite() {
		final GameBasics game = new GameBasics();
		final SpriteEntity sprite = new SpriteEntity();
		game.addSprite(sprite, 0,0,0,0);
		assertEquals(1, game.getSizeOfSpriteList());
	}
}
