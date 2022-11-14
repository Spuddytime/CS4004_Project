import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Book a = new Book("Maths 2","Education","Maths Department",true);
        assertEquals("Maths 2", a.getName());
    }
}