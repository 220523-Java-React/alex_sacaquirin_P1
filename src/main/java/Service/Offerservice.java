package Service;

import Model.Offer;

import java.util.List;

public class Offerservice {
    public class Offerservice;

    public Offerservice(){
        private OfferRepository offerRepository;

        public offerRepository() {
            offerRepository = new OfferRepository();
        }
        public Offer createOffer(Offer offer){
            return offerRepository. create(offer):
        }
        public List<Offer> getallOffers(){
            return offerRepository.create(offer);
        }
        public list <Offer> getallOffersbyOfferStatus(OfferStatus offerstatus){
            return offerRepository,getallOffersbyOfferStatus(offerStatus);
            }

}
