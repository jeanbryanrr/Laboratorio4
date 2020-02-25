package com.bryanrr.laboratorio4.model;

public class Student {
    private String name;
    private String description;
    private String address;
    private int imageResource;

    public Student(String name, String description, String address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public Student(String name, String description, String address, int imageResource) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
