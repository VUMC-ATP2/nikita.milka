package classroom.objects;

public class PezDispenser {

    String name;
    int capacity;
    int currentCandyCount;

    public PezDispenser(String name) {
        this.name = name;
        capacity = 20;
        currentCandyCount = 20;
    }

    public void eat() {
        if (currentCandyCount <= 0) {
            System.out.println("I can't eat, please load me!");
        } else {
            currentCandyCount--;
            System.out.println("I ate one pez!");
        }
    }

    public void eat(int candyCount) {
        if (currentCandyCount <= 0) {
            System.out.println("I can't eat, please load me!");
        } else if (currentCandyCount <= candyCount) {
            System.out.println("Not enough candies, there are only left:" + currentCandyCount);
        } else {
            currentCandyCount = currentCandyCount - candyCount;
            System.out.printf("I ate %d pezs. And there are only left: %d\n", candyCount, currentCandyCount);
        }
    }

    public void load() {
        currentCandyCount = capacity;
        System.out.println("I am loaded!");
    }
}