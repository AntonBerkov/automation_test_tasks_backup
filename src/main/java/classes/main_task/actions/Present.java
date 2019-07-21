package classes.main_task.actions;

import classes.main_task.model.*;

public class Present {

    public void makePresent() {
        Sweet sweet[] = new Sweet[5];
        sweet[0] = new Chocolate("Алёнка", 200, 50, 2, 30);
        sweet[1] = new Lollipop("БонПари", 120, 30, 1.5, "Лесные ягоды");
        sweet[2] = new Chocolate("Alprose ", 300, 20, 4, 55.6);
        sweet[3] = new JellyCandy("Южная ночь", 300, 40, 3);
        sweet[4] = new Candy("Ромашка", 200, 30, 2);
        double totalWeight = totalWeight(sweet);
        Sweet sortedSweet[] = sortSweetByPrice(sweet);
        printResult(sortedSweet, totalWeight);
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

    public void printResult(Sweet[] sweet, double totalWeight) {
        double totalCost = 0;
        System.out.println("Sweet sorted by sugar:");
        for (int i = 0; i < sweet.length; i++) {
            System.out.println(sweet[i].toString());
            totalCost += sweet[i].cost(sweet[i].getWeight(), sweet[i].getPrice());
        }
        System.out.println("Total cost: " + totalCost);
        System.out.println("Total weight: " + totalWeight);
    }
}
