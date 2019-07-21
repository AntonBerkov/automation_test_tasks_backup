package classes.main_task.model;

public class Candy extends Sweet {

    public Candy(String name, int weight, int sugar, double price) {
        super(name, weight, sugar, price);
    }

    @Override
    public double cost(int weight, double price) {
        double cost = (double) (weight / 100) * price;
        return cost;
    }
}
