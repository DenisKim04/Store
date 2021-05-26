package com.company.model.good.products;

import com.company.model.good.enumsOfGoods.GoodMeet;

import java.util.Locale;
import java.util.Scanner;

public class Meet extends Products{
    private String typesOfMeat;

    public Meet() {
    }

    public Meet( int id, String name, double price, boolean availability, String typesOfMeat) {
        super( id, name, price, availability);
        this.typesOfMeat = typesOfMeat;
    }

    public String getTypesOfMeat() {
        return typesOfMeat;
    }

    public void setTypesOfMeat(String typesOfMeat) {
        this.typesOfMeat = typesOfMeat;
    }

    public Products catalogOfMeet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Meet: Chicken , Beef , steak");
        String meet = scanner.next().toUpperCase(Locale.ROOT);
        GoodMeet goodMeet = GoodMeet.valueOf(meet);
        switch (goodMeet) {
            case CHICKEN:
                Meet chicken = new Meet(1, "KFC", 100, true, "Chicken");
                return chicken;
            case BEEF:
                Meet beef = new Meet(2, "Bull", 150, true, "Beef");
                return beef;
            case STEAK:
                Meet steak = new Meet(3, "Leg", 165, true, "beef");
                return steak;
        }
        return null;

    }
}
