package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {

    public Team makeNewTeam() {
        return new Team("Test Team", "For this test");
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void newTeamInstantiatesCorrectly_true() throws Exception  {
        Team testTeam = makeNewTeam();
        assertTrue(testTeam instanceof Team);
    }

    @Test
    public void newTeamInstantiatesWithAttributes() throws Exception {
        Team testTeam = makeNewTeam();
        assertEquals("Test Team", testTeam.getName());
        assertEquals("For this test", testTeam.getDescription());
        assertEquals(1, testTeam.getId());
    }
}