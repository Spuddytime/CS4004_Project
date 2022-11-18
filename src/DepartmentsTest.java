import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

//Integrated into Jira for ease of access: KEY for integration is PROJECT-9

//These fail at the moment so we need to make the programme to fix that
//I decided to split each class into their own respective class tests for my coverage strategy.
class DepartmentsTest {
    Book maths1 = new Book();
    Book maths2 = new Book();
    Book science1 = new Book();
    Book science2 = new Book();


    static Departments a;
    static Departments b;
    ArrayList<Book> mathsDept = new ArrayList<>();



    @BeforeAll
    public static void test(){
        ArrayList<Book> mathsDept = new ArrayList<>();
        b = new Departments("Maths Department","Education",14000.00);
    }

    @Test
    void getDepartmentBooks() {
        assertEquals("Maths 2" , b.getDepartmentBooks());
    }

    @Test
    void getUnavailableBooks() {
        assertEquals("[Maths 1, Science 2]" , b.getUnavailableBooks());
    }

    @Test
    void getName() {
        assertEquals("Maths Department" , b.getName());
    }

    @Test
    void getType() {
        assertEquals("Education" , b.getType());
    }

    @Test
    void setName() {
        b.setName("Maths Dept");
        assertEquals("Maths Dept" , b.getName());
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
        assertEquals(true , a.isSubscriptionStatus());

    }

    @Test
    void setDepartmentBooks() {
        mathsDept.add(maths1); // I can't for the life of me figure out how to test these arraylist methods -SW
        mathsDept.add(maths2);
        mathsDept.add(science1);
        mathsDept.add(science2);
        assertEquals("Maths 1", a.getDepartmentBooks());

    }

    @Test
    void setBudget() {
        Departments a = new Departments();
        a.setBudget(12000.00);
        assertEquals(12000.00, a.getBudget());

    }

    @Test
    void setSubscriptionStatus() {
        Departments a = new Departments();
        a.setSubscriptionStatus(false);
        assertEquals(false, a.isSubscriptionStatus());

    }

    @Test
    void setUnavailableBooks() {
        Departments a = new Departments();

    }
}