package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void shouldAnswerWithTrue1() {
    	assertTrue(false);
    }
    
    @Test
    public void shouldAnswerWithFalse() {
    	assertFalse(false);
    }
}
