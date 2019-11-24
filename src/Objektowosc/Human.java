package Objektowosc;

public class Human {
    private String name;
    private String surname;
    private Integer birthYear;
    private Integer age;

   public Human ( String name, String surname, Integer birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = this.obliczWiek();
    }

    //slowka static pozwala dostac sie do tej funkcji bez inicjalizacji obiektu
    //nie mozemy operowac w niej na zadnych atrybutach/metodach niestatycznych
    public static void  opiszKlase(){
       System.out.println("Klasa Human oblicza wiek i umozliwia przedstawienie sie obiektu");
    }
    private Integer obliczWiek () {
        Integer actualYear = 2019;
        return actualYear - this.birthYear;
    }
    public void przedstawSie () {
        System.out.println("Hej, nazywam sie " + this.name + " " + this.surname);
        System.out.println("Mam " + this.age + " lata");
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
}