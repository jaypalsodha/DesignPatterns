package com.sample.common.icecreams;

public class ChocolateIceCream implements IceCream{

    private Long price;
    private Integer calories;


    public ChocolateIceCream(Long price, Integer calories){
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String getIceCreamName() {
        return IceCreamCategory.CHOCOLATE_ICECREAM;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public Integer getCalories() {
        return calories;
    }
}
