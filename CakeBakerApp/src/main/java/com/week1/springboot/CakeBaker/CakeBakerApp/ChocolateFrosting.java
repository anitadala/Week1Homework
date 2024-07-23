package com.week1.springboot.CakeBaker.CakeBakerApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return " Chocolate Frosting";
    }
}
