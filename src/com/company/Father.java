package com.company;

public class Father {
    private String familySurname;
    private String address;
    private int assetValue;

    public String getFamilySurname() {
        return familySurname;
    }

    public void setFamilySurname(String familySurname) {
        this.familySurname = familySurname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(int assetValue) {
        this.assetValue = assetValue;
    }

    @Override
    public String toString() {
        return "Father{" +
                "familySurname='" + familySurname + '\'' +
                ", address='" + address + '\'' +
                ", assetValue=" + assetValue +
                '}';
    }

    public Father(String familySurname, String address, int assetValue) {
        this.familySurname = familySurname;
        this.address = address;
        this.assetValue = assetValue;
    }
    public void whatToCookForDinner(){
        System.out.println("Pizza");
    }
    public void test()
    {

    }
    public void test(String name)
    {

    }
}
