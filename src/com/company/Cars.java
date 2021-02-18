package com.company;

import java.util.Locale;

public class Cars {
    private int doors;
    private int wheels;
    private String engine;
    private String model;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("focus")){
            this.model = model;
        } else{
            this.model = "unKnow";
        }

    }

    public String getModel(){
        return model;
    }
}
