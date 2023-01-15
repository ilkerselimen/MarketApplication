package entities.abstracts;

import java.util.Date;

public abstract class EntityBase {

    public int productId;

    public String productName;

    public Date mfgDate; // Manufacturing Date --> Imalat tarihi

    public Date arrivalDate; //Ürün gelis tarihi

    public Date expDate; //Expired Date --> son kullanim tarihi --> long

    public double price;

    public double lastPrice;

    public double unitIsStock;

    public String barcode;

    public String qrCode;

    public String description;

    public double kdvHesapla(double price){
        lastPrice *=1.18;
        return price;
    }

}