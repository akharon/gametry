package com.akharon.game.basics.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.akharon.game.basics.SpriteEntity;

public class SpriteTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testisShown()
	{
		final SpriteEntity sprite = new SpriteEntity();
		assertEquals(false, sprite.isShown());
	}
	
	@Test
	public void testdraw()
	{
		final SpriteEntity sprite = new SpriteEntity();
		sprite.draw(3,3);
		assertEquals(3, sprite.getPosX());
		assertEquals(3, sprite.getPosY());
	}
	
	@Test
	public void testcollided()
	{
		final SpriteEntity sprite = new SpriteEntity();
		assertEquals(false, sprite.collided());
	}
}
