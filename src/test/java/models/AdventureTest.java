package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdventureTest {
    @Test
    public void newAdventure_instantiatesCorrectly() throws Exception{
        Adventure testAdventure = new Adventure("Matt");
        assertTrue(testAdventure instanceof Adventure);
    }

    @Test
    public void newAdventure_getsName_matt() throws Exception{
        Adventure testAdventure = new Adventure("Matt");
        assertEquals("Matt", testAdventure.getHeroName());
    }
}