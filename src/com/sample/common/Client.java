package com.sample.common;

import com.sample.common.icecreams.IceCream;
import com.sample.common.icecreams.IceCreamFactory;

import java.util.Scanner;

public class Client {


    public static void main(String args[])
    {
        System.out.println("Please select the ice cream of your choice from below list:- ");
        System.out.println("chocolate");
        System.out.println("Strawberry");

        Scanner scanner = new Scanner(System.in);
        String selectedIceCream = scanner.next();
        IceCreamFactory iceCreamFactory = new IceCreamFactory();
        IceCream iceCream = null;
        iceCream = iceCreamFactory.createIceCream(selectedIceCream);
        if(iceCream != null)
            System.out.println("Ice Cream of your choice is " +iceCream.getIceCreamName()+" with price "+iceCream.getPrice()+" having "+iceCream.getCalories()+" calories");
        else
            System.out.println("Ice Cream of your choice is not available in the store");

    }

}
