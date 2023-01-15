package entities.concretes;

import entities.abstracts.EntityBase;
import entities.abstracts.Test;

import java.util.Date;

public class Beverages extends EntityBase implements Test {

    public int box;

    public int deposition;

    public String materiel;

    @Override
    public double kdvHesapla(double price) {
        return super.kdvHesapla(1.08);
    }


    @Override
    public double otvHesapla(double price) {

        price *= 1.21;
        return price;
    }
}