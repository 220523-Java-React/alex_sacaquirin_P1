package Service;

import Model.Offer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OfferServiceTest {
    public void whenGivenAnOfferObjectCreateOfferDoesNotThrowAnException(){
        Offerservice service  = new Offerservice();
        Offer offer = new Offer();
        Assertions.assertDoesNotThrow(()-> service.createOffer(offer));
    }
    @Test
    public void whenGivenAnOfferObjectCreateOfferReturnsTrue(){
        Offerservice service = new Offerservice();
        Offer offer = new Offer();
        Assertions.assertNotNull(service.createOffer(offer));
    }
}
