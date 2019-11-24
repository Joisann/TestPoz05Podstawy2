public class Car {
    private String marka;
    private String model;
    private Integer rokProdukcji;
    private Integer age;
    private Integer predkosc;
    Car(String marka, String model, Integer rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.age = this.obliczWiek();
        this.predkosc = 0;
    }
    private Integer obliczWiek () {
        Integer actualYear = 2019;
        return actualYear - rokProdukcji;
    }
    public void przyspiesz (Integer zmiana) {
        this.predkosc +=zmiana;
        System.out.println("Twoja aktualna predkosc to: " + this.predkosc);
    }
    public void opiszAuto() {
        System.out.println("Oto " + this.marka + " " + this.model);
        if(this.age < 5) {
            System.out.println("Nowe auto, prawie nie uzywane");
        }else if( this.age <= 20) {
            System.out.println("Troche juz jezdzi, ale jeszcze dziala");
        }else{
            System.out.println("Nadaje sie tylko na zlom");
        }
    }
}