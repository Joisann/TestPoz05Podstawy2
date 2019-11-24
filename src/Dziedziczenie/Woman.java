package Dziedziczenie;

import Objektowosc.Human;

public class Woman extends Human {

    private String plec;

    public Woman(String name, String surname, Integer birthYear){
        super(name, surname, birthYear);
        this.plec = "kobieta";
    }

    //nadpisywanie metod

    public void przedstawSie(){
        System.out.println("Jestem " + this.plec);
    }

}
