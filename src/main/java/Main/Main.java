package Main;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(30);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Mom", 5);
        cats[1] = new Cat("Murka", 4);
        cats[2] = new Cat("Pushinka", 7);
        cats[3] = new Cat("Ben", 10);
        cats[4] = new Cat("Siri", 8);

        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isSatiety()) System.out.printf("%s сыт\n", cat.getName());
            else System.out.printf("%s голоден\n", cat.getName());
            plate.info();
        }

        plate.increaseFood(1000);
        plate.info();

    }

}
