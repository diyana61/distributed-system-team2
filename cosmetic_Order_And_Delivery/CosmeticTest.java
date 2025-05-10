package cosmetic_Order_And_Delivery;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CosmeticTest {

    private Cosmetic cosmetic;

    @Before
    public void setUp() {
        cosmetic = new Cosmetic();
    }

    @Test
    public void testSetAndGetId() {
        cosmetic.setId(1);
        assertEquals(1, cosmetic.getId());
    }

    @Test
    public void testSetAndGetTitle() {
        cosmetic.setTitle("Moisturizing Cream");
        assertEquals("Moisturizing Cream", cosmetic.getTitle());
    }

    @Test
    public void testSetAndGetDescription() {
        cosmetic.setDescription("Hydrates and softens skin.");
        assertEquals("Hydrates and softens skin.", cosmetic.getDescription());
    }

    @Test
    public void testSetAndGetPrice() {
        cosmetic.setPrice(280.99);
        assertEquals(280.99, cosmetic.getPrice(), 0.001);
    }

    @Test
    public void testSetAndGetImageName() {
        cosmetic.setImageName("cream.jpg");
        assertEquals("cream.jpg", cosmetic.getImageName());
    }

    @Test
    public void testSetAndIsFeature() {
        cosmetic.setFeature(true);
        assertTrue(cosmetic.isFeature());

        cosmetic.setFeature(false);
        assertFalse(cosmetic.isFeature());
    }

    @Test
    public void testSetAndIsActive() {
        cosmetic.setActive(true);
        assertTrue(cosmetic.isActive());

        cosmetic.setActive(false);
        assertFalse(cosmetic.isActive());
    }
}
