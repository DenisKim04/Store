package com.company;

import com.company.model.Authentication;
import com.company.model.Magazine;
import com.company.model.good.enumsOfGoods.CatalogOfGoods;
import com.company.model.good.products.Bread;
import com.company.model.good.products.Meet;
import com.company.model.good.products.Milk;
import com.company.model.good.products.Products;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Login:");
        String login = scanner.next();
        System.out.print("Enter Password: ");
        String password = scanner.next();
        Authentication authentication = new Authentication(login,password);
        System.out.println("-----------------------------------------");
        System.out.print("Enter your Login: ");
        String userLogin = scanner.next();
        System.out.print("Enter your Password: ");
        String userPassword = scanner.next();
        authentication.authorization(userLogin,userPassword);
        System.out.println("Summ your goods");
        int summGoods = scanner.nextInt();
        Products[] basket = new Products[summGoods+1];
       if (authentication.authorization(userLogin,userPassword)){
           for (int i = 0; i == basket.length; i++) {
                   basket[i] = catalogOf();

           }

       }

    }


    public static Products catalogOf(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Goods: Bread , Meet, Milk: ");
        System.out.println("--------------------------------------");
        String catalogOf = scanner.next().toUpperCase(Locale.ROOT);
        CatalogOfGoods catalogOfGoods = CatalogOfGoods.valueOf(catalogOf);
        switch (catalogOfGoods){
            case BREAD:
                Bread bread = new Bread();
                bread.catalogOfBread();
                return bread;
            case MEET:
                Meet meet = new  Meet();
                meet.catalogOfMeet();
                return meet;
            case MILK:
                Milk milk = new Milk();
                milk.catalogOfMilk();
                return milk ;
        }

        return null;
    }
}
