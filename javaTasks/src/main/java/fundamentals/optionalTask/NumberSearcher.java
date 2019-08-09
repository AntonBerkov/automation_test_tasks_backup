package fundamentals.optionalTask;

import java.util.Arrays;
import java.util.List;

public class NumberSearcher {

    public void searchForBiggestAndSmallestNumber(String numbers) {
        List<String> numberList = Arrays.asList(numbers.split(" "));
        System.out.println(numberList);
        int minLength = numberList.get(0).length();
        int maxLength = minLength;
        String minNumber = numberList.get(0);
        String maxNumber = minNumber;
        for (String number : numberList) {
            if (number.length() > maxLength) {
                maxLength = number.length();
                maxNumber = number;
            }

            if (number.length() < minLength) {
                minLength = number.length();
                minNumber = number;
            }
        }
        System.out.println("Самое длинное число " + maxNumber + " " + "Длина: " + (maxLength));
        System.out.println("Самое короткое число " + minNumber + " " + "Длина: " + (minLength));
    }
}
