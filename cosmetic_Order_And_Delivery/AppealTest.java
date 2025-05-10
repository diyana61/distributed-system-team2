package cosmetic_Order_And_Delivery;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppealTest {

    private Appeal appeal;

    @BeforeEach
    void setUp() {
        appeal = new Appeal();
    }

    @Test
    void testSetAndGetAppealId() {
        appeal.setAppealId(1);
        assertEquals(1, appeal.getAppealId());
    }

    @Test
    void testSetAndGetOrderId() {
        appeal.setOrderId(100);
        assertEquals(100, appeal.getOrderId());
    }

    @Test
    void testSetAndGetCustomerId() {
        appeal.setCustomerId(200);
        assertEquals(200, appeal.getCustomerId());
    }

    @Test
    void testSetAndGetBrandId() {
        appeal.setBrandId(300);
        assertEquals(300, appeal.getBrandId());
    }

    @Test
    void testSetAndGetAdminId() {
        appeal.setAdminId(400);
        assertEquals(400, appeal.getAdminId());
    }

    @Test
    void testSetAndGetAppealMessage() {
        String message = "Received wrong product";
        appeal.setAppealMessage(message);
        assertEquals(message, appeal.getAppealMessage());
    }

    @Test
    void testSetAndGetResolutionDetails() {
        String resolution = "Replacement sent";
        appeal.setResolutionDetails(resolution);
        assertEquals(resolution, appeal.getResolutionDetails());
    }

    @Test
    void testUpdateStatusThrowsUnsupportedOperationException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            appeal.updateStatus(1, 400, 999);
        });
    }
}
