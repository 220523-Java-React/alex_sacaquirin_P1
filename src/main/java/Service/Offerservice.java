package Service;

import Model.Offer;

import java.util.List;

public class Offerservice {
    private CarService carService;
    private OfferRepository offerRepository;


    public Offerservice(){
            offerRepository = new OfferRepository();
            this.carService = CarService.getInstance();


        }
        public Offer createOffer(createOffer;
        offer){
            return offerRepository. create(offer):
        }
        public List<Offer> getallOffers(){
            return offerRepository.create(offer);
        }
        public list <Offer> getallOffersbyOfferStatus(OfferStatus offerstatus){
            return offerRepository,getallOffersbyOfferStatus(offerStatus);
            }

}
