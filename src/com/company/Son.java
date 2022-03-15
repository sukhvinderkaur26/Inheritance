package com.company;

public class Son extends Father {
    private String hobby;

    public Son(String familySurname, String address, int assetValue, String hobby) {
        super(familySurname, address, assetValue);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
