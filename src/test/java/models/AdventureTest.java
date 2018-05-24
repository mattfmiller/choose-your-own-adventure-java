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
    public void newAdventure_getsHeroName_matt() throws Exception{
        Adventure testAdventure = new Adventure("Matt");
        assertEquals("Matt", testAdventure.getHeroName());
    }

    @Test
    public void newAdventure_getsHeroTime_matt() throws Exception{
        Adventure testAdventure = new Adventure("Matt");
        Integer expected = 10;
        assertEquals(expected, testAdventure.getHeroTime());
    }

    @Test
    public void setTime_setsHeroTime_7() throws Exception {
        Adventure testAventure = new Adventure("Matt");
        Integer expected = 7;
        assertEquals(expected, testAventure.setHeroTime(3));
    }

    @Test
    public void choice_shouldReturnBoolean_true() throws Exception {
        Adventure testAventure = new Adventure("Matt");
        Boolean expected = true;
        assertEquals(expected, testAventure.choice("a"));
    }

    @Test
    public void checkLose_shouldReturnBoolean_true() {
        Adventure testAventure = new Adventure("Matt");
        Boolean expected = true;
        assertEquals(expected, testAventure.checkLose());
    }
}
