package Model;

import java.io.Serializable;
import java.util.Objects;

public class Offer implements Serializable {
    public double price;
    public String status;
    private int id;

    public Offer() {

    }
    public int getId(){
        return id;
    }
    public Offer setId(int id){
        this.id = id;
        return this;
    }
    public String getStatus(){
        return status;
    }
    public Offer setStatus(String status){
        this.status = status;
        return this;
    }

    public double getPrice() {
        return price;
    }
    public Offer setPrice(double price){
        this.price = price;
        return this;
    }
    @Override
    public boolean equals(Object o){
        if(this ==o) return true;
        if (o==null|| getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return id == offer.id && Objects.equals(status,offer.status) && Objects.equals(price, offer.price);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,status,price);
    }
    @Override
    public String toString(){
        return "Offer{"+
                "id="+ id+
                ",offerStatus='"+status +'\'' +
                ",offerPrice=" + price +
                '}';

    }
}