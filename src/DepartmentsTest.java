import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//These fail at the moment so we need to make the programme to fix that
class DepartmentsTest {

    @Test
    void getDepartmentBooks() {
        Departments a = new Departments();
        assertEquals("Maths 2" , a.getDepartmentBooks());
    }

    @Test
    void getUnavailableBooks() {
        Departments a = new Departments();
        assertEquals("[Maths 1, Science 2]" , a.getUnavailableBooks());
    }

    @Test
    void getName() {
        Departments a = new Departments();
        assertEquals("Maths Department" , a.getName());
    }

    @Test
    void getType() {
        Departments a = new Departments();
        assertEquals("Education" , a.getType());
    }

    @Test
    void setName() {
        Departments a = new Departments();
        a.setName("Maths Department");
    }

    @Test
    void setType() {
        Departments a = new Departments();
        a.setType("Education");
    }

}