public class Main {
    public static void main(String[] args) {
        var spider = new spider();
        spider.eat();

        System.out.println(" ");

        var cat = new cat();
        cat.setName("rodolfo");
        cat.getName();
        cat.play();
        cat.eat();
        cat.walk();

        System.out.println("\n");

        var fish = new fish();
        fish.setName("nemo");
        fish.getName();
        fish.play();
        fish.walk();
        fish.eat();

    }
}