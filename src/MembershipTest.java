import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MembershipTest {

    static Membership member;

    @BeforeAll
    public static void test(){
        member = new Membership("student",false, false, true, false);
    }

    @Test
    void getStatus(){
        assertEquals("student", member.getStatus());
    }

    @Test
    void setStatus(){
        member.setStatus("staff");
        assertEquals("staff", member.getStatus());
        member.setStatus("student");
    }

    @Test
    void getStaff(){
        assertEquals(false, member.getStaff());
    }

    @Test
    void setStaff(){
        member.setStaff(true);
        assertEquals(true, member.getStaff());
        member.setStaff(false);
    }

    @Test
    void getManager(){
        assertEquals(false, member.getManager());
    }

    @Test
    void setManager(){
        member.setManager(true);
        assertEquals(true, member.getManager());
        member.setManager(false);
    }

    @Test
    void getStudent(){
        assertEquals(true, member.getStudent());
    }

    @Test
    void setStudent(){
        member.setStudent(false);
        assertEquals(false, member.getStudent());
        member.setStudent(true);
    }

    @Test
    void getPublicUser(){
        assertEquals(false, member.getPublicUser());
    }

    @Test
    void setPublicUser(){
        member.setPublicUser(true);
        assertEquals(true, member.getPublicUser());
        member.setPublicUser(false);
    }
}
