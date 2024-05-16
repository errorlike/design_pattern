package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();

        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println(milkCoffee.getDescription());

        Coffee whipCoffee = new WhipCoffee(simpleCoffee);
        System.out.println(whipCoffee.getDescription());

        Coffee whipMilkCoffee = new WhipCoffee(milkCoffee);
        System.out.println(whipMilkCoffee.getDescription());
    }
}
