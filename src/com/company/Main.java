package com.company;

public class Main {

    public static void main(String[] args) {
        // Here we created three reference variable(Remote access)
        //This is called tight coupling
//        Son son=new Son("Singh","Edmonton",20000,"Reading");
//        Father father=new Father("Singh","Edmonton",10000);
//        Daughter daughter=new Daughter("Kaur","Canada",15000,"Mann");
//
//
//        //Using parent class reference variable to hold child object
//        //this is called loose coupling
//        Father father=new Father("Singh","Edmonton",10000);
//        father=new Son("Singh","Edmonton",20000,"Reading");
//        father=new Daughter("Kaur","Canada",15000,"Mann");
//

        // will print father method "pizza"
        Father father=new Father("Singh","Edmonton",10000);
        father.whatToCookForDinner();
        //this is the case of run time polymorphism
        father.test();





        //will print son method "Burgar"
        father=new Son("Singh","Edmonton",20000,"Reading");
        father.whatToCookForDinner();

    }
}
