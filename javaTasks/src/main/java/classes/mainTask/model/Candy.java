package classes.mainTask.model;

public class Candy extends Sweet {
    private String filling;

    public Candy(String name, int weight, int sugar, double price, String filling) {
        super(name, weight, sugar, price);
        this.filling = filling;
    }

    @Override
    public double cost(int weight, double price) {
        return (double) (weight / 100) * price;
    }
}
