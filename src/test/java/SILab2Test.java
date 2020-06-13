import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


public class SILab2Test {
    private final SILab2 lab2 = new SILab2();

    protected static ArrayList<String> users;
    protected static String mail;

    @BeforeAll
    static void init() {
        users = new ArrayList<>();
        users.add("user1");
        users.add("user2");

        mail = "mail@mail.com";
    }

    @Test
    void testEveryStatement() {
        assertFalse(lab2.function(null, users));
        assertTrue(lab2.function(new User("sezgo", "my$passworD1", mail), users));
        System.out.println("All test cases for every statement criteria!");
    }

    @Test
    void testEveryBranch() {
        assertFalse(lab2.function(null, users));
        assertFalse(lab2.function(new User(null, null, null), users));
        assertTrue(lab2.function(new User("sezgo", "mypass$worD1", mail), users));
        assertFalse(lab2.function(new User("sezgo", "Sezgo$pasS", mail), users));
        assertFalse(lab2.function(new User("sezgo", "mypass123", mail), users));
        System.out.println("All test cases for every branch criteria!");
    }
}
