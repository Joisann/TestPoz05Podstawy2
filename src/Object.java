import Dziedziczenie.Man;
import Dziedziczenie.Woman;
import Objektowosc.Human;

public class Object {
    public static void main(String[] args) {
        Human czlowiek1 = new Human ( "Julia", "Gut", 1995);
        czlowiek1.przedstawSie();
        Human czlowiek2 = new Human("Tomek", "Kowalski", 1987);
        czlowiek2.przedstawSie();
        Human czlowiek3 = new Human("Sylwia", "Koc", 1985);
        czlowiek3.przedstawSie();
        System.out.println(czlowiek2.getName() + " " + czlowiek2.getSurname());
        czlowiek2.setBirthYear(1988);
        czlowiek2.przedstawSie();

        Woman kobieta1 = new Woman( "Asia", "Koc", 1998);
        kobieta1.przedstawSie();
        kobieta1.setBirthYear(1996);
        kobieta1.getName();

        Man mezczyzna1 = new Man("Jacek", "Kowski", 1973);
        mezczyzna1.setWaga(70);
        mezczyzna1.ocenSile();
        mezczyzna1.przedstawSie();


    }
}