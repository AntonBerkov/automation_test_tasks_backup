package classes.mainTask.model;

public class Sweet {

    private String name;
    private int weight;
    private int sugar;
    private double price;

    public Sweet(String name, int weight, int sugar, double price) {
        this.weight = weight;
        this.sugar = sugar;
        this.price = price;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getSugar() {
        return sugar;
    }

    public double cost(int weight, double price) {
        double cost = (double) (weight / 100) * price;
        return cost;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", sugar=" + sugar;
    }
}


