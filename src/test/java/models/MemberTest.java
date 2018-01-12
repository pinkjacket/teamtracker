package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    @Before
    public void clearAll() {
        Member.empty();
    }

    public Member makeNewMember() {
        return new Member("Testguy");
    }

    @Test
    public void newMemberInstantiatesCorrectly_true() throws Exception {
        Member testMember = makeNewMember();
        assertTrue(testMember instanceof Member);
    }

    @Test
    public void newMemberInstantiatesWithAttributes() throws Exception {
        Member testMember = makeNewMember();
        assertEquals("Testguy", testMember.getName());
        assertEquals(1, testMember.getId());
    }

    @Test
    public void getAllReturnsAllMembers_true() throws Exception {
        Member testMember = makeNewMember();
        Member testMemberTwo = new Member ("Guy 2");
        assertEquals(true, Member.getAll().contains(testMember));
        assertEquals(true, Member.getAll().contains(testMemberTwo));
    }

    @Test
    public void findReturnsMemberWithRightId() {
        Member testMember = makeNewMember();
        Member testMemberTwo = new Member ("Guy 2");
        assertEquals(Member.find(testMemberTwo.getId()), testMemberTwo);
    }
}