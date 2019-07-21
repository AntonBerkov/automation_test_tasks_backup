package classes.main_task.model;

public class Chocolate extends Sweet {
    private double cacaoPerentage;

    public Chocolate(String name, int weight, int sugar, double price, double cacaoPersentage) {
        super(name, weight, sugar, price);
        this.cacaoPerentage = cacaoPersentage;
    }

    @Override
   public double cost(int weight, double price) {
        double cost = (double) (weight / 200) * price;
        return cost;
    }

}
