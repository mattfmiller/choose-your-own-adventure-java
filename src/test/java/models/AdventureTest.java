package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdventureTest {
    @Test
    public void newAdventure_instantiatesCorrectly() throws Exception{
        Adventure testAdventure = new Adventure("Matt");
        assertTrue(testAdventure instanceof Adventure);
    }
}