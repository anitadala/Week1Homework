package com.week1.springboot.CakeBaker.CakeBakerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
    @Autowired
     Frosting frosting;
    @Autowired
     Syrup syrup;


    public CakeBaker(Frosting frosting,Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }
    String BakeCake(){
        return "Baking of Cake using" + frosting.getFrostingType() + " and" + syrup.getSyrupType();
    }
}
