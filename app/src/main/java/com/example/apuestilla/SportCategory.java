package com.example.apuestilla;


public class SportCategory {
    private String name;
    private int imageResource;

    public SportCategory(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}