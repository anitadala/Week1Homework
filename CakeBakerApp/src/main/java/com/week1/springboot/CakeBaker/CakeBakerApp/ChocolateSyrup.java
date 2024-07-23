package com.week1.springboot.CakeBaker.CakeBakerApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateSyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return " Chocolate Syrup ";
    }
}
