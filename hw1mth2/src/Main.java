public class Main {
    public static void main(String[] args) {

        Home home = new Home("19", "Шакиров");


        Father objectA = new Father("Айбек", 60, home, "Айсулуу",EnumFamily.valueOf("WORKING") );
        System.out.println(objectA.getInfo());


        System.out.println("---------------------------");
        Son objectB = new Son("Олег", 40, home , "Светлана", EnumFamily.STUDY, 180);
        System.out.println(objectB.getInfo());


        System.out.println("------------------------------");
        Son objectC = new Son("Бекбол", 35, home , "Жанаргул", EnumFamily.WORKING, 175);
        System.out.println(objectC.getInfo());





    }
}