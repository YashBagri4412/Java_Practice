package com.company;


final public class Laptop {
    final private String processor;
    final private int screen;
    public Laptop(String processor,int screen){
        this.processor = processor;
        this.screen = screen;
    }

    public String getProcessor() {
        return processor;
    }

    public int getScreen() {
        return screen;
    }
}
