import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Integrated into Jira for ease of access: KEY for integration is PROJECT-9

//These fail at the moment so we need to make the programme to fix that
//I decided to split each class into their own respective class tests for my coverage strategy.
class DepartmentsTest {

    static Departments a;
    static Departments b;

    @BeforeAll
    public static void test(){
        a = new Departments();
        b = new Departments("Maths Dept","Education",14000.00);
    }

    @Test
    void getDepartmentBooks() {
        assertEquals("Maths 2" , a.getDepartmentBooks());
    }

    @Test
    void getUnavailableBooks() {
        assertEquals("[Maths 1, Science 2]" , a.getUnavailableBooks());
    }

    @Test
    void getName() {
        assertEquals("Maths Department" , a.getName());
    }

    @Test
    void getType() {
        assertEquals("Education" , a.getType());
    }

    @Test
    void setName() {
        a.setName("Maths Department");
        assertEquals("Maths Department" , a.getName());
    }

    @Test
    void setType() {
        Departments a = new Departments();
        a.setType("Education");
    }

    @Test
    void getBudget() {
        assertEquals(14000.00 , b.getBudget());
    }

    @Test
    void isSubscriptionStatus() {
        Departments a = new Departments();

    }

    @Test
    void setDepartmentBooks() {
        Departments a = new Departments();

    }

    @Test
    void setBudget() {
        Departments a = new Departments();

    }

    @Test
    void setSubscriptionStatus() {
        Departments a = new Departments();

    }

    @Test
    void setUnavailableBooks() {
        Departments a = new Departments();

    }
}