package cosmetic_Order_And_Delivery;

import org.junit.Before;
import org.junit.Test;

public class CosmeticServiceTest {

    private cosmeticService service;

    @Before
    public void setUp() {
        service = new cosmeticService();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddCosmetic() {
        service.addCosmetic("Lipstick - Red", 1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetCosmeticById() {
        service.getCosmeticById(10);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetCosmeticsByCategory() {
        service.getCosmeticsByCategory(5);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetAllCosmetics() {
        service.getAllCosmetics();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateCosmetic() {
        Cosmetic cosmetic = new Cosmetic(); // Ensure Cosmetic class exists
        service.updateCosmetic(cosmetic);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDeleteCosmetic() {
        service.deleteCosmetic(20);
    }
}
