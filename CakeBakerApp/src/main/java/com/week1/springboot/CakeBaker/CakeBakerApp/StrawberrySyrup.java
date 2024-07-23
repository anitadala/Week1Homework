package com.week1.springboot.CakeBaker.CakeBakerApp;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
