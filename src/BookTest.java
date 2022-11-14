import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        assertEquals(3.50, a.getLateFee());
    }

    @Test
    void getLengthOfRent() {
        Book a = new Book("Maths 2", "Education", "Maths Department", true);
        assertEquals(14, a.getLengthOfRent());
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
}
