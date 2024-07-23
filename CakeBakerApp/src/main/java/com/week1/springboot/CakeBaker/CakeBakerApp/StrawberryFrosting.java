package com.week1.springboot.CakeBaker.CakeBakerApp;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting ";
    }
}
