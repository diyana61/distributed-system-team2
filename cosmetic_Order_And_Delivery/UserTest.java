package cosmetic_Order_And_Delivery;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testSetAndGetId() {
        User user = new User();
        user.setId(101);
        assertEquals(101, user.getId());
    }

    @Test
    void testSetAndGetFullName() {
        User user = new User();
        user.setFullName("Feysel Mifta");
        assertEquals("Feysel Mifta", user.getFullName());
    }

    @Test
    void testSetAndGetPasswordHash() {
        User user = new User();
        user.setPasswordHash("hashed123");
        assertEquals("hashed123", user.getPasswordHash());
    }

    @Test
    void testSetAndIsActive() {
        User user = new User();
        user.setActive(true);
        assertTrue(user.isActive());

        user.setActive(false);
        assertFalse(user.isActive());
    }

    @Test
    void testChangePasswordThrowsException() {
        User user = new User();
        assertThrows(UnsupportedOperationException.class, () -> user.changePassword(1234));
    }

    @Test
    void testLogoutThrowsException() {
        User user = new User();
        assertThrows(UnsupportedOperationException.class, user::logout);
    }
}
