package cosmetic_Order_And_Delivery;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppealServiceTest {

    private AppealService appealService;

    @BeforeEach
    void setUp() {
        appealService = new AppealService();
    }


    @Test
    void testGetAppealDetailsThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            appealService.getAppealDetails(1);
        });
    }

    @Test
    void testGetAppealThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            appealService.getAppeal(1);
        });
    }

    @Test
    void testResolveAppealThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            appealService.resolveAppeal(1);
        });
    }

    @Test
    void testGetAppealByStatusThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            appealService.getAppealByStatus("open");
        });
    }
}
