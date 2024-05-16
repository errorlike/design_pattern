package decorator;

public class MilkCoffee implements Coffee {
    private final Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 2;

    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "+牛奶";
    }

}
