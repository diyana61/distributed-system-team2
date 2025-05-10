package cosmetic_Order_And_Delivery;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminTest {

    private Admin admin;

    @BeforeEach
    void setUp() {
        admin = new Admin();
    }

    @Test
    void testSetAndGetUserName() {
        admin.setUserName("admin123");
        assertEquals("admin123", admin.getUserName());
    }

    @Test
    void testManageCosmeticThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            admin.manageCosmetic(1);
        });
    }

    @Test
    void testManageCategoryThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            admin.manageCategory(1);
        });
    }

    @Test
    void testViewAllOrdersThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            admin.viewAllOrders();
        });
    }

    @Test
    void testContactBrandThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            admin.contactBrand(1, 1);
        });
    }
}
