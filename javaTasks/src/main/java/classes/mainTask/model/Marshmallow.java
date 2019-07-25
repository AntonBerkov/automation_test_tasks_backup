package classes.mainTask.model;

public class Marshmallow extends Sweet {
    private boolean withChocolate;

    public Marshmallow(String name, int weight, int sugar, double price, boolean withChocolate) {
        super(name, weight, sugar, price);
        this.withChocolate = withChocolate;
    }

    @Override
   public double cost(int weight, double price) {
        return (double) (weight / 100) * price;
    }

}
