import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {


    public static Double cenaBrutto(Double cena){
       return cena*1.23;
    }


    //funkcja egzekucyjna
    public static void main(String[] args){


        HashMap<String, Double> owoce = new HashMap<>();
        owoce.put("banan", 2.5);
        owoce.put("truskawka", 4.80);
        owoce.put("pomarancza", 6.29);
        owoce.put("jagoda", 15.89);
        List<String> nazwyOwocow = new ArrayList<>();
        nazwyOwocow.add("banan");
        nazwyOwocow.add("truskawka");
        nazwyOwocow.add("pomarancza");
        nazwyOwocow.add("jagoda");

        Double cenaSumaryczna = 0.0;
        for (Integer i = 0; i < owoce.size(); i++){
            String owoc = nazwyOwocow.get(i);
            cenaSumaryczna += cenaBrutto(owoce.get(owoc));
            System.out.println(owoc);
            System.out.println(cenaBrutto(owoce.get(owoc)));
        }
        System.out.println("Cena Twoich zakupow to: " + cenaSumaryczna.toString());
    }
}




      /*  Kasia Nowakowska - trener 2:19 PM
        Stworz HashMape, gdzie kluczami beda owoce (String), a wartościami - values cena (Double)
        Dodaj do Hashmapy 3 wybrane owoce z wymyslonymi przez siebie cenami
        (w funkcji egzekucyjnej)
        Stworz funkcję, która pomnoży cenę podaną w argumencie funkcji przez 1.23 i zwróci ten wynik (czyli kwotę brutto)
        W petli dodaj do siebie wszystkie ceny brutto.
        Na koncu wyswietl informacje: "Cena Twoich zakupow to: " + sumaryczna cena wszystkich owoców brutto
        zeby pobrac wartosc ze slownika korzystamy z funkcji get(Key), np
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put("Tomek", 5);
        mapa1.get("Tomek");
        mapa1.get("Tomek") zwróci nam w powyższym przykłądzie 6
        zwroci 5
       */