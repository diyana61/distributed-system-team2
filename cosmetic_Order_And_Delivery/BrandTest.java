package cosmetic_Order_And_Delivery;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BrandTest {

    private Brand brand;

    @Before
    public void setUp() {
        brand = new Brand();
    }

    @Test
    public void testSetAndGetBrandId() {
        brand.setBrandId(101);
        assertEquals(101, brand.getBrandId());
    }

    @Test
    public void testSetAndGetBrandName() {
        brand.setBrandName("Glow Cosmetics");
        assertEquals("Glow Cosmetics", brand.getBrandName());
    }

    @Test
    public void testSetAndGetBrandEmail() {
        brand.setBrandEmail("contact@glow.com");
        assertEquals("contact@glow.com", brand.getBrandEmail());
    }

    @Test
    public void testSetAndGetBrandDescription() {
        brand.setBrandDescription("Luxury skincare and beauty products");
        assertEquals("Luxury skincare and beauty products", brand.getBrandDescription());
    }

    @Test
    public void testSetAndGetAccountNumber() {
        brand.setAccountNumber("1000188280432");
        assertEquals("1000188280432", brand.getAccountNumber());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateCosmetic() {
        brand.updateCosmetic(1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddCosmetic() {
        brand.addCosmetic(1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDeleteCosmetic() {
        brand.deleteCosmetic(1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testViewOwnOrders() {
        brand.viewOwnOrders();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testViewDashboardData() {
        brand.viewDashboardData();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateProfile() {
        brand.updateProfile();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testContactAdmin() {
        brand.contactAdmin(1, 1);
    }
}
