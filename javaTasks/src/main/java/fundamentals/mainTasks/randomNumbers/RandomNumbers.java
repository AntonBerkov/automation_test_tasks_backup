package fundamentals.mainTasks.randomNumbers;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] randomNumbersSet = new int[6];
        Random random = new Random();
        for (int i = 0; i < randomNumbersSet.length; i++) {
            randomNumbersSet[i] = random.nextInt();
        }
        for (int i = 0; i < randomNumbersSet.length; i++) {
            if (i < 3) {
                System.out.print(randomNumbersSet[i] + " ");
            } else System.out.print("\n" + randomNumbersSet[i]);
        }
    }
}
