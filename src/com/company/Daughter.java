package com.company;

public class Daughter extends Father {
    private String friend;

    public Daughter(String familySurname, String address, int assetValue, String friend) {
        super(familySurname, address, assetValue);
        this.friend = friend;
    }
}
