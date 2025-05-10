package cosmetic_Order_And_Delivery;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    private customer cust;

    @Before
    public void setUp() {
        cust = new customer();
    }

    @Test
    public void testSetAndGetEmail() {
        cust.setEmail("feysel@example.com");
        assertEquals("feysel@example.com", cust.getEmail());
    }

    @Test
    public void testSetAndGetCreateAt() {
        cust.setCreateAt(20250509);
        assertEquals(20250509, cust.getCreateAt());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRegister() {
        cust.register();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testPlaceOrders() {
        cust.placeOrders(101);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testViewOrder() {
        cust.viewOrder();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testContactAdmin() {
        cust.contactAdmin(1, 123);
    }
}
