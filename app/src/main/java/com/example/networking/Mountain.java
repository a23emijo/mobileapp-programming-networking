package com.example.networking;

@SuppressWarnings("WeakerAccess")
public class Mountain {

    private String name;

    public Mountain(String name) {
        this.name = name;
    }

    public void getName() {
        this.name = name;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                '}';
    }
}
