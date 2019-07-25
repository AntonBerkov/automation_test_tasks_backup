package classes.mainTask.model;

public class ChocolateCandy extends Candy {
    private double cacaoPerentage;

    public ChocolateCandy(String name, int weight, int sugar, double price, String filling, double cacaoPerentage) {
        super(name, weight, sugar, price, filling);
        this.cacaoPerentage = cacaoPerentage;
    }

    @Override
    public double cost(int weight, double price) {
        return (double) (weight / 100) * price;
    }
}
