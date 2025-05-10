package cosmetic_Order_And_Delivery;

import org.junit.Before;
import org.junit.Test;

public class OrderServiceTest {

    private OrderService orderService;

    @Before
    public void setUp() {
        orderService = new OrderService();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateOrder() {
        orderService.createOrder("Sample Order", 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetOrdersByCustomer() {
        orderService.getOrdersByCustomer(1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetBrandOrder() {
        orderService.getBrandOrder(2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetAllOrders() {
        orderService.getAllOrders();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateOrderStatus() {
        orderService.updateOrderStatus(10, "Shipped");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOrderPaymentProof() {
        orderService.orderPaymentProof();
    }
}
