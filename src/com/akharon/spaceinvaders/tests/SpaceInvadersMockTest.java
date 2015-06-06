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
package com.akharon.spaceinvaders.tests;


import org.junit.Rule;
import org.junit.Test;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;

import com.akharon.spaceinvaders.SpaceInvaders;
import com.akharon.game.basics.Sprite;
import com.akharon.game.basics.Window;

/**
 * @author akharon
 *
 */
public class SpaceInvadersMockTest {
	   @Rule
	    public final JUnitRuleMockery context = new JUnitRuleMockery();
	   
	    @Test
	    public void testaddSprite() throws Exception {
	        
	        final Sprite sprite = context.mock(Sprite.class);

	        context.checking(new Expectations() {{
	        	
	        }});

	        final SpaceInvaders spaceInvaders = new SpaceInvaders();
	        spaceInvaders.addSprite(sprite);
	    }
	    
	    @Test
	    public void testaddWorld() throws Exception {
	        
	        final Window window = context.mock(Window.class);

	        context.checking(new Expectations() {{
	        	oneOf(window).setFPS(with(0));
	        	oneOf(window).setGroundLevel(with(0));
	        	oneOf(window).setMessage(with("Hello World !"));
	        	oneOf(window).setScore(with(0));
	        	oneOf(window).setHeight(with(480));
	        	oneOf(window).setWidth(with(640));
	        }});

	        final SpaceInvaders spaceInvaders = new SpaceInvaders();
	        spaceInvaders.initWindow(window);
	    }
}
