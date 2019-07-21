package classes.main_task.model;

public class Lollipop extends Candy {
    private String taste;

    public Lollipop(String name, int weight, int sugar, double price, String filling, String taste) {
        super(name, weight, sugar, price, filling);
        this.taste = taste;
    }

    @Override
    public double cost(int weight, double price) {
        return (double) (weight / 100) * price;
    }
}
