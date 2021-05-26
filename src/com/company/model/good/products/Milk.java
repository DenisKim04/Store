package com.company.model.good.products;

import com.company.model.good.enumsOfGoods.GoodMilk;

import java.util.Locale;
import java.util.Scanner;

public class Milk extends Products {
    private double fatContent;

    public Milk() {
    }

    public Milk( int id, String name, double price, boolean availability, double fatContent) {
        super( id, name , price, availability);
        this.fatContent = fatContent;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public Products catalogOfMilk(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Milk: Young meat , White river , Funny milker");
        String milk = scanner.next().toUpperCase(Locale.ROOT);
        GoodMilk goodMilk = GoodMilk.valueOf(milk);
        switch (goodMilk){
            case YOUNGMEAT :
                Milk youngMeat = new Milk(1,"Young meat",45,false,20);
                return youngMeat;
            case WHITERIVER:
                Milk whiteRiver = new Milk(2,"White river",60,true,15);
                return whiteRiver;
            case FUNNYMILKER:
                Milk funnyMilker = new Milk(3,"Funny milker",50,true,30);
                return  funnyMilker;
        }
        return null;
    }
}
