package classes.mainTask.main;

import classes.mainTask.actions.PresentAction;
import classes.mainTask.model.Sweet;

public class Main {

    public static void main(String[] args) {
        Sweet sweet[] = new Sweet[5];
        PresentAction present = new PresentAction();
        present.makePresent(sweet);
        double totalWeight = present.totalWeight(sweet);
        Sweet sortedSweet[] = present.sortSweetByPrice(sweet);
        present.printResult(sortedSweet, totalWeight);
    }
}
