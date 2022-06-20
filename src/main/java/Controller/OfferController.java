package Controller;

import Model.Offer;
import Service.Offerservice;

import java.util.logging.Handler;

public class OfferController {
    Offerservice offerservice;
    public OfferController(){
        offerservice = new Offerservice();
    }
    public OfferController(Offerservice offerservice){
        this.offerservice = offerservice;
    }
    public Handler getAllOffers = context ->{
        context.json(offerservice.getAllOffers());
    };

    public Handler createNewOffer = context -> {
        Offer offer = context.bodyAsClass(Offer.class);
        offerservice.createOffer(offer);
    };
}
