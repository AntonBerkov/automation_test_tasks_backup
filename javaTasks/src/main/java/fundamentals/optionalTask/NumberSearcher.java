package fundamentals.optionalTask;

        import java.util.List;

public class NumberSearcher {

    public void searchForBiggestAndSmallestNumber(List<String> numberList) {
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

    public void searchForMoreThanAverageLength(List<String> numberList) {
        int sumLenght = 0;
        for (String number : numberList) {
            sumLenght += number.length();
        }
        double averageLength = sumLenght / numberList.size();
        System.out.println("Числа, длина которых больше средней длины по всем числам");
        for (String number : numberList) {
            if (number.length() > averageLength) {
                System.out.println("Число " + number + " Длина: " + number.length());
            }
        }
    }
}
