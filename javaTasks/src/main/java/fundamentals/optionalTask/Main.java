package fundamentals.optionalTask;

//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//Вывести на консоль те числа, длина которых больше средней длины по всем числам, а также длину.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String numbers = inputNumbers.nextLine();
        List<String> numberList = Arrays.asList(numbers.split(" "));
        NumberSearcher numberSearcher = new NumberSearcher();
        numberSearcher.searchForBiggestAndSmallestNumber(numberList);
        numberSearcher.searchForMoreThanAverageLength(numberList);
    }
}
