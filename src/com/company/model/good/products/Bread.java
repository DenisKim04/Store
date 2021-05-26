package com.company.model.good.products;

import com.company.model.good.enumsOfGoods.GoodBread;

import java.util.Locale;
import java.util.Scanner;

public class Bread extends Products{
    private String typesOfBread;


    public Bread() {
    }

    public Bread(int id,String name, double price, boolean availability, String typesOfBread) {
        super( id, name, price, availability);
        this.typesOfBread = typesOfBread;
    }

    public String getTypesOfBread() {
        return typesOfBread;
    }

    public void setTypesOfBread(String typesOfBread) {
        this.typesOfBread = typesOfBread;
    }
Bread bread1 = new Bread();
    public Products catalogOfBread(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bread need: Rye , Wheaten,gray bread, white Bread: ");
        String bread = scanner.next().toUpperCase(Locale.ROOT);
        GoodBread goodBread = GoodBread.valueOf(bread);
        switch (goodBread){
            case RYE :
               // bread1 = new  Bread(1,"Ray",14,true,"Ray");
                bread1.setId(1);
                bread1.setName("Ray");
                bread1.setPrice(14);
                bread1.setAvailability(true);
                bread1.setTypesOfBread("Ray");
                return bread1;
            case WHEATEN:
                Bread wheaten = new Bread(2,"Riha",10,false,"Wheaten");
                return wheaten;
            case GRAYBREAD:
                Bread graybread = new Bread(3,"Breads",11,true,"Gray");
                return graybread;
            case WHITEBREAD:
                Bread whiteBread = new Bread(4,"Bread",15,true,"White");
                return whiteBread;
        }
        return null;
    }
}
