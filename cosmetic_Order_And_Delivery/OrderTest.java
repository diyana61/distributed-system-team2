package cosmetic_Order_And_Delivery;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class OrderTest {

    private Order order;

    @Before
    public void setUp() {
        order = new Order();
    }

    @Test
    public void testSetAndGetId() {
        order.setId(1);
        assertEquals(1, order.getId());
    }

    @Test
    public void testSetAndGetCosmeticId() {
        order.setCosmeticId(10);
        assertEquals(10, order.getCosmeticId());
    }

    @Test
    public void testSetAndGetPrice() {
        order.setPrice(59.99);
        assertEquals(59.99, order.getPrice(), 0.001);
    }

    @Test
    public void testSetAndGetQuantity() {
        order.setQuantity(3);
        assertEquals(3, order.getQuantity());
    }

    @Test
    public void testSetAndGetTotal() {
        order.setTotal(179.97);
        assertEquals(179.97, order.getTotal(), 0.001);
    }

    @Test
    public void testSetAndGetOrderDate() {
        Date now = new Date();
        order.setOrderDate(now);
        assertEquals(now, order.getOrderDate());
    }

    @Test
    public void testSetAndGetStatus() {
        order.setStatus("Processing");
        assertEquals("Processing", order.getStatus());
    }

    @Test
    public void testSetAndGetCustomerContact() {
        order.setCustomerContact("251-919-4352");
        assertEquals("251-919-4352", order.getCustomerContact());
    }

    @Test
    public void testSetAndGetCustomerEmail() {
        order.setCustomerEmail("hawa@example.com");
        assertEquals("hawa@example.com", order.getCustomerEmail());
    }

    @Test
    public void testSetAndGetCustomerId() {
        order.setCustomerId(77);
        assertEquals(77, order.getCustomerId());
    }

    @Test
    public void testSetAndGetBrandId() {
        order.setBrandId(12);
        assertEquals(12, order.getBrandId());
    }

    @Test
    public void testSetAndGetPaymentProof() {
        order.setPaymentProof("receipt123.png");
        assertEquals("receipt123.png", order.getPaymentProof());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateStatus() {
        order.updateStatus(2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCalculateTotal() {
        order.calculateTotal();
    }
}
