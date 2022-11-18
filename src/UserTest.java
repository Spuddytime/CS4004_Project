import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Author Rodger Shaw

public class UserTest {

    static User user1;
    @BeforeAll
    public static void test(){
        user1 = new User("Mark", 12345, 321);
    }

    @Test
    void getName(){
        assertEquals("Mark", user1.getName());
    }

    @Test
    void setName(){
        user1.setName("Mary");
        assertEquals("Mary", user1.getName());
    }

    @Test
    void getId(){
        assertEquals(12345, user1.getId());
    }

    @Test
    void setId(){
        user1.setId(54321);
        assertEquals(54321, user1.getId());
    }

    @Test
    void getPassword(){
        assertEquals(321, user1.getPassword());
    }

    @Test
    void setPassword(){
        user1.setPassword(123);
        assertEquals(123, user1.getPassword());
        user1.setPassword(321);
    }
}
