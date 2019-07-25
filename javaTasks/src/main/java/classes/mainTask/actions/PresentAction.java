package classes.mainTask.actions;

import classes.mainTask.model.*;

public class PresentAction {

    public void makePresent(Sweet[] sweet) {
        sweet[0] = new Marshmallow("Mini", 50,50, 1,false);
        sweet[1] = new Lollipop("БонПари", 120, 30, 1.5, null, "Лесные ягоды");
        sweet[2] = new ChocolateCandy("Алёнка", 150, 30, 1.4, null, 30);
        sweet[3] = new ChocolateCandy("Ромашка", 300, 40, 3, null,33);
        sweet[4] = new Candy("Птичье молоко", 200, 20, 2, "Суфле");
    }

    public double totalWeight(Sweet[] sweet) {
        double countWeight = 0;
        for (int i = 0; i < sweet.length; i++) {
            countWeight += sweet[i].getWeight();
        }
        return countWeight;
    }

    public Sweet[] sortSweetByPrice(Sweet[] sweet) {
        for (int i = sweet.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sweet[j].getSugar() > sweet[j + 1].getSugar()) {
                    Sweet tmp = sweet[j];
                    sweet[j] = sweet[j + 1];
                    sweet[j + 1] = tmp;
                }
            }
        }
        return sweet;
    }

    public void printResult(Sweet[] sortedSweet, double totalWeight) {
        double totalCost = 0;
        System.out.println("Sweet sorted by sugar:");
        for (int i = 0; i < sortedSweet.length; i++) {
            System.out.println(sortedSweet[i].toString());
            totalCost += sortedSweet[i].cost(sortedSweet[i].getWeight(), sortedSweet[i].getPrice());
        }
        System.out.println("Total cost: " + totalCost);
        System.out.println("Total weight: " + totalWeight);
    }
}
