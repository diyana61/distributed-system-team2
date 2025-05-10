package cosmetic_Order_And_Delivery;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {

	private Category category;

	@Before
	public void setUp() {
		category = new Category();
	}

	@Test
	public void testSetAndGetCategoryId() {
		category.setCategoryId(1);
		assertEquals(1, category.getCategoryId());
	}

	@Test
	public void testSetAndGetCategoryName() {
		category.setCategoryName("Skincare");
		assertEquals("Skincare", category.getCategoryName());
	}

	@Test
	public void testSetAndGetDescription() {
		category.setDescription("Products related to skin care.");
		assertEquals("Products related to skin care.", category.getDescription());
	}
}
