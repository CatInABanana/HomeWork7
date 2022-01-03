package Main;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite){
            p.decreaseFood(appetite);
            System.out.printf("Кот %s поел\n", name);
            satiety = true;
        } else System.out.printf("Коту %s не хватило еды\n", name);
    }

}
