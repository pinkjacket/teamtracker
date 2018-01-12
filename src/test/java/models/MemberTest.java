package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    public Member makeNewMember() {
        return new Member("Testguy");
    }

    @Test
    public void newMemberInstantiatesCorrectly_true() throws Exception {
        Member testMember = makeNewMember();
        assertTrue(testMember instanceof Member);
    }

    @Test
    public void newMemberInstantiatesWithName_String() throws Exception {
        Member testMember = makeNewMember();
        assertEquals("Testguy", testMember.getName());
    }

    @Test
    public void getAllReturnsAllMembers_true() throws Exception {
        Member testMember = makeNewMember();
        Member testMemberTwo = new Member ("Guy 2");
        assertEquals(true, Member.getAll().contains(testMember));
        assertEquals(true, Member.getAll().contains(testMemberTwo));
    }
}