import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static String zwrocImie(Integer case1){
        //Integer case1 = 5;
        String imie = "";
        switch (case1){
            case 1: imie = "Kasia"; break;
            case 5: imie = "Tomek"; break;
            case 8: imie = "Dawid"; break;
            default: imie = "NoName";
        }
        return imie;
    }

    public static void przedstawSie(String imie){
        System.out.println("Moje imie to " + imie);
    }

    //wpisujemy Main
    //funkcja egzekucyjna
    public static void main(String[] args) {
        String imie = zwrocImie(5);
        przedstawSie(imie);
        imie = zwrocImie(1);
        przedstawSie(imie);
        przedstawSie(zwrocImie(10));





        System.out.println("Hej, drugi raz cos wypisze");
        System.out.println("Hej, moj pierwszy program");

        //zmienne
        //Definicja Typu (String) nazwa zmiennej (napis1) + opcjonalnie przydzielenie wartości
        //String - typ tekstowy, jego wartością jest napis (w "")
        String napis1 = "Napis1";

        //boolean - zmienna logiczna, zwraca true lub false
        Boolean isTomek = napis1.contains("Tomek");
        System.out.print(isTomek);

        //Integer - typ numeryczny liczb calkowitych
        //Long - liczba calkowita, duzo dluzsza
        Integer liczba1 = 2;
        Long liczba2 = Long.valueOf(1302);
        liczba1.equals(liczba2);
        //Typ prosty, Integer to klasa wrapujaca typ prosty int (daje metody
        //ulatwiajace prace z danym typem
        int liczba3 = 5;

        //Float - typ typ numeryczny zmiennoprzecinkowy
        //Float ulamek1 = 10.155;
        Double ulamek2 = 10.5;

        //Kolekcje
        //Lista - zbior elementow w indeksie
        List<String> lista1 = new ArrayList<>();
        lista1.add(napis1);
        lista1.add("Tomek");
        System.out.println(lista1.toString());

        //HashMap - slownik trzymajacy pary klucz-wartosc
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put("Tomek", 5);
        System.out.println(mapa1.toString());
        //ctrl + shift + F10 - odpala aktualna konfiguracje

        //Pair - slownik tylko jedna pare klucz - wartosc
        //to drugie pair (przed "=") to nazwa zmiennej, ktora sama nadaje
        Pair<String, Integer> pair = new Pair<>("Kasia", 1);
        String napis2 = pair.getKey();
        napis2 += pair.getValue().toString();
        System.out.println(napis2);

        //Petle
        //petla for
        //Warune poczatkowy (wartosc poczatkowa licznika);
        //warunek koncowy (wartosc koncowa licznika);
        //modyfikator licznika i++ oznacza, ze i bedzie wieksze o 1 po przejsciu petli
        for(Integer i=0; i<=5; i++){
            System.out.println("Wartosc licznika: " + i.toString());
        }

        Integer i = 0;
        while(i<5){
            System.out.println("Jestem w while po raz " + i.toString());
            i++;
        }

        //break to haslo, ktore pozwala zakonczyc dzialanie petli
        while(true){
            i++;
            if (i.equals(7))
                continue;
            System.out.print(" " + i.toString());
            if (i==10)
                break;
        }

        //petla do while zawsze wykona sie chociaz 1 iteracja
        do {
            System.out.println("Jestem w do while " + i.toString());
            i++;
        } while(i<10);

        for (String el: lista1){
            System.out.println("Element listy: " + el);
        }

        //Petla for each na mapie #TODO
        //for (String el: mapa1){}

        //Instrukcje warunkowe
        //Instrukcje if...else if...else
        if (lista1.size() == 2){
            System.out.println("Hej, jestem w instrukcji warunkowej");
        }else {
            System.out.println("Jestem w instrukcji else");
        }

        if (lista1.size() < 1){
            System.out.println("Nie wykonam sie");
        }else if (lista1.size() == 2){
            System.out.println("Ja sie wykonam");
        }else {
            System.out.println("Ja sie juz nie wykonam, bo warunek jest spelniony");
        }

        //Instr warunkowa switch case
        i = 5;
        String message = "Moje imie to ";
        switch (i) {
            case 2: message += "Kasia"; break;
            case 5: message += "Tomek"; break;
            case 8: message += "Dawid"; break;
        }

        System.out.println(message);
    }
}
