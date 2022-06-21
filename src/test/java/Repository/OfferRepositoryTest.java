package Repository;

import org.junit.jupiter.api.Test;

public class OfferRepositoryTest {
    @Test
    public void testGetAllOffers(){
        OfferRepository offerRepository = new OfferRepository();
        offerRepository.getAll();
    }
}
