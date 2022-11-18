//Name:Stephen Walsh ID:21334234 done in IntelliJ with Java 18
//Integrated into Jira for ease of access: KEY for integration is PROJECT-9


//This is for testing the methods etc.. they should fail first

//Will need to come back to this, so I can figure out how JUnit works

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {

    @Test
    void getName() {
        Library a2 = new Library("UWON" , true , "Member of staff" , 20);
        assertEquals("UWON" , a2.getName());
    }

    @Test
    void setName() {
        Library UWON = new Library("UWON",true);
        UWON.setName("University Of Wonderland");
        assertEquals("University Of Wonderland" , UWON.getName());
    }

    @Test
    void isOpen() {
        Library UWON = new Library("UWON",true);
        assertTrue(UWON.isOpen());
    }

    @Test
    void setOpen() {
        Library UWON = new Library("UWON",true);
        UWON.setOpen(false);
        assertFalse(UWON.isOpen());
    }

    @Test
    void getStaff() {
        Library a2 = new Library("UWON" , true , "Member of staff" , 20);
        assertEquals(20 , a2.getStaff());

    }

    @Test
    void setStaff() {
        Library UWON = new Library("UWON",true);
        UWON.setStaff(20);
        assertEquals(20 , UWON.getStaff());

    }

    @Test
    void getMembership() {
        Library a2 = new Library("UWON" , true , "Member of staff" , 20);
        assertEquals("Member of staff" , a2.getMembership());

    }

    @Test
    void setMembership() {
        Library UWON = new Library("UWON",true);
        UWON.setMembership("Member of the public");
        assertEquals("Member of the public" , UWON.getMembership());

    }
}
