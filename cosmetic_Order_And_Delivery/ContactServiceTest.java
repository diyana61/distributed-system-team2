package cosmetic_Order_And_Delivery;

import org.junit.Before;
import org.junit.Test;

public class ContactServiceTest {

	private contactService service;

	@Before
	public void setUp() {
		service = new contactService();
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testCreateContact() {
		service.createContact(1, 101, 202);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testMarkContactAsRead() {
		service.markContactAsRead(5);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testAddCosmetic() {
		service.addCosmetic("Lipstick - Red", 12);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testGetCosmeticById() {
		service.getCosmeticById(42);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testUpdateCosmetic() {
		Cosmetic cosmetic = new Cosmetic(); // Make sure this class exists
		service.updateCosmetic(cosmetic);
	}
}
