package com.akharon.game.basics.test;


import org.junit.Rule;
import org.junit.Test;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;

import com.akharon.game.basics.GameBasics;
import com.akharon.game.basics.SampleMock;
import com.akharon.game.basics.Sprite;

public class GameBasicsMockTest {
	   @Rule
	    public final JUnitRuleMockery context = new JUnitRuleMockery();
	   
	    @Test
	    public void productFound() throws Exception {
	        
	        final Sprite sprite = context.mock(Sprite.class);

	        context.checking(new Expectations() {{
	        	oneOf(sprite).setPosX(with(1));
	            oneOf(sprite).setPosY(with(1));
	            oneOf(sprite).setHeight(with(2));
	            oneOf(sprite).setWidth(with(2));
	        }});

	        final GameBasics gameBasics = new GameBasics();
	        gameBasics.addSprite(sprite, 1,1,2,2);
	    }
}
