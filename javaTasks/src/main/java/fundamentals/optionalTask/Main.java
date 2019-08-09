package fundamentals.optionalTask;

//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String numbers = inputNumbers.nextLine();
        NumberSearcher numberSearcher = new NumberSearcher();
        numberSearcher.searchForBiggestAndSmallestNumber(numbers);
    }
}
