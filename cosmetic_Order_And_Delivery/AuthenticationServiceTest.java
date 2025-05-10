package cosmetic_Order_And_Delivery;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthenticationServiceTest {

    private AuthenticationService authService;

    @BeforeEach
    void setUp() {
        authService = new AuthenticationService();
    }

    @Test
    void testAuthenticateCustomerThrowsException() {
        Object dummyCredentials = new Object(); // Replace with actual CredentialsDto when available
        assertThrows(UnsupportedOperationException.class, () -> {
            authService.authenticateCustomer(dummyCredentials);
        });
    }

    @Test
    void testAuthenticateBrandThrowsException() {
        Object dummyCredentials = new Object(); // Replace with actual CredentialsDto when available
        assertThrows(UnsupportedOperationException.class, () -> {
            authService.authenticateBrand(dummyCredentials);
        });
    }

    @Test
    void testAuthenticateAdminThrowsException() {
        Object dummyCredentials = new Object(); // Replace with actual CredentialsDto when available
        assertThrows(UnsupportedOperationException.class, () -> {
            authService.authenticateAdmin(dummyCredentials);
        });
    }

    @Test
    void testInvalidateSessionThrowsException() {
        assertThrows(UnsupportedOperationException.class, () -> {
            authService.invalidateSession("session123");
        });
    }
}
