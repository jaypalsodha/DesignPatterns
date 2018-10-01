package com.sample.common.icecreams;

import com.sample.common.icecreams.IceCream;

public class IceCreamFactory {

    public IceCream createIceCream(String typeOfIceCream){

        if(typeOfIceCream != null && typeOfIceCream.equalsIgnoreCase(IceCreamCategory.CHOCOLATE_ICECREAM)){
            return new ChocolateIceCream(20L,30);
        }
        else if(typeOfIceCream != null && typeOfIceCream.equalsIgnoreCase(IceCreamCategory.STRAWBERRY_ICECREAM)){
            return new StrawberryIceCream(60L,25);
        }
        return null;
    }
}
