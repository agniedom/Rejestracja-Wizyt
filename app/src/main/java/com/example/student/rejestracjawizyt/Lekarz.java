package com.example.student.rejestracjawizyt;

/**
 * Created by student on 2018-01-17.
 */

public class Lekarz {

    private String name;
    private String specjal;


    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getSpecjal() {
        return this.specjal;
    }

    public void setSpecjal(String Specjal) {
        this.specjal = Specjal;
    }

    public Lekarz(String name,  String specjal) {
        this.name = name;
        this.specjal = specjal;
    }

}
