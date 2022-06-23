package Service;

import Model.Car;
import Model.Offer;
import Repository.OfferRepository;

import java.util.List;

public class Offerservice {
    OfferRepository offerRepository;

    public Offerservice(){
        offerRepository = new OfferRepository();
    }
    public Offerservice(OfferRepository offerRepository){
        this.offerRepository = offerRepository;
    }
    public Offer createOffer(Offer offer){
        return offerRepository.create(offer);
    }
    public List<Offer> getAllOffers(){
        return offerRepository.getAll();
    }
    public Car getOfferById(int id){
        return offerRepository.getById(id);
    }
    public boolean deleteOfferById(int id){
        return offerRepository.deleteById(id);
    }

}

