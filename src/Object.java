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
    }
}