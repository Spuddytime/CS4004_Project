import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//All of these current tests now function and pass the test
class BookTest {

    @Test
    void getName() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        assertEquals("Maths 2", a.getName());
    }

    @Test
    void getDepartment() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        assertEquals("Maths Department", a.getDepartment());
    }

    @Test
    void getGenre() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        assertEquals("Education", a.getGenre());
    }

    //These 2 Fail as we have not set up these 2 methods yet
    @Test
    void getLateFee() {
        Book b = new Book("Maths 2", "Education", "Maths Department", true, 3.50,14);
        assertEquals(3.50, b.getLateFee());
    }

    @Test
    void getLengthOfRent() {
        Book b = new Book("Maths 2", "Education", "Maths Department", true, 3.50,14);
        assertEquals(14, b.getLengthOfRent());
    }

    @Test
        //Test will change the name from maths 2 to Science 2 and should then pass its test
    void setName() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        a.setName("Science 2");
        assertEquals("Science 2", a.getName());
    }


    @Test
    void setGenre() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        a.setGenre("Mathematics");
        assertEquals("Mathematics", a.getGenre());
    }

    @Test
    void setAvailable() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        a.setAvailable(false);
        assertEquals(false, a.isAvailable());
    }

    @Test
    void isAvailable() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        assertEquals(true, a.isAvailable());
    }

    @Test
    void setDepartment() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        a.setDepartment("Education Department");
        assertEquals("Education Department", a.getDepartment());
    }

    @Test
    void setLateFee() {
        Book b = new Book("Maths 2", "Education", "Maths Department", true, 3.50,14);
        b.setLateFee(5.00);
        assertEquals(5.00, b.getLateFee());
    }

    @Test
    void setLengthOfRent() {
        Book b = new Book("Maths 2", "Education", "Maths Department", true, 3.50,14);
        b.setLengthOfRent(21);
        assertEquals(21, b.getLengthOfRent());
    }
}
