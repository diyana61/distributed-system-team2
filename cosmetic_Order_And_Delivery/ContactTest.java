package cosmetic_Order_And_Delivery;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class ContactTest {

    private Contact<Date> contact;

    @Before
    public void setUp() {
        contact = new Contact<>();
    }

    @Test
    public void testSetAndGetId() {
        contact.setId(101);
        assertEquals(101, contact.getId());
    }

    @Test
    public void testSetAndGetFullName() {
        contact.setFullName("nigus folla");
        assertEquals("nigus folla", contact.getFullName());
    }

    @Test
    public void testSetAndGetSubject() {
        contact.setSubject("Order Delay");
        assertEquals("Order Delay", contact.getSubject());
    }

    @Test
    public void testSetAndGetMessage() {
        contact.setMessage("My order is delayed, please check.");
        assertEquals("My order is delayed, please check.", contact.getMessage());
    }

    @Test
    public void testSetAndGetDate() {
        Date now = new Date();
        contact.setDate(now);
        assertEquals(now, contact.getDate());
    }

    @Test
    public void testSetAndGetEmail() {
        contact.setEmail("nigus@gmail.com");
        assertEquals("nigus@gmail.com", contact.getEmail());
    }

    @Test
    public void testSetAndIsRead() {
        contact.setRead(true);
        assertTrue(contact.isRead());

        contact.setRead(false);
        assertFalse(contact.isRead());
    }
}
