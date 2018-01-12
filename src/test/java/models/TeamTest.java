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
    public void clearAll() throws Exception {
        Team.empty();
    }

    @Test
    public void newTeamInstantiatesCorrectly() throws Exception  {
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

    @Test
    public void getAllReturnsAllTeams() throws Exception {
        Team testTeam = makeNewTeam();
        Team testTeam2 = new Team("Team 2", "The second team");
        assertEquals(true, Team.getAll().contains(testTeam));
        assertEquals(true, Team.getAll().contains(testTeam2));
    }

    @Test
    public void emptyEmptiesTeamsFromList() throws Exception {
        Team testTeam = makeNewTeam();
        Team.empty();
        assertEquals(0, Team.getAll().size());
    }

    @Test
    public void findReturnsTeamWithRightId() throws Exception {
        Team testTeam = makeNewTeam();
        Team testTeam2 = new Team("Team 2", "The second team");
        assertEquals(Team.find(testTeam2.getId()), testTeam2);
    }

    @Test
    public void getMembersCreatesEmptyList() throws Exception {
        Team testTeam = makeNewTeam();
        assertEquals(0, testTeam.getMembers().size());
    }

    @Test
    public void addMemberAddsMembersToList() {
        Team testTeam = makeNewTeam();
        Member testMember = new Member("Testguy");
        testTeam.addMember(testMember);
        assertTrue(testTeam.getMembers().contains(testMember));
    }
}