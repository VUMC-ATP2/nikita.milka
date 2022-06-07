package classroom.objects;

public class PezTester {
    public static void main(String[] args) {
        PezDispenser captainAmerica = new PezDispenser("Captain American");
        captainAmerica.eat();
        System.out.println(captainAmerica.currentCandyCount);
        captainAmerica.eat(7);
        captainAmerica.eat(13);
        captainAmerica.load();
        captainAmerica.eat(13);
    }
}
