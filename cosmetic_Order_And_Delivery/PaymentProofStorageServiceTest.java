package cosmetic_Order_And_Delivery;

import org.junit.Before;
import org.junit.Test;

public class PaymentProofStorageServiceTest {

    private paymentProofstorageService service;

    @Before
    public void setUp() {
        service = new paymentProofstorageService();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testStoreProof() {
        service.storeProof();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetProofUrl() {
        service.getProofUrl("proof123");
    }
}
