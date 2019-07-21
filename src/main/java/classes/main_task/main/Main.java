package classes.main_task.main;

import classes.main_task.actions.PresentAction;
import classes.main_task.model.Sweet;

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
