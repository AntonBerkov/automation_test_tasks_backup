package fundamentals.optionalTask;

import java.util.Scanner;

public class FindMonth {
   public void searchMonth() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        String line = inputNumber.nextLine();
        int number = 0;
        if (line.charAt(0)!='0') {
            number = Integer.parseInt(line);
        } else {
            errorMessage();
            System.exit(0);
        }

        String month = null;

        switch (number) {
            case 1:
                month = "Январь";
                break;
            case 2:
                month = "Февраль";
                break;
            case 3:
                month = "Март";
                break;
            case 4:
                month = "Апрель";
                break;
            case 5:
                month = "Май";
                break;
            case 6:
                month = "Июнь";
                break;
            case 7:
                month = "Июль";
                break;
            case 8:
                month = "Август";
                break;
            case 9:
                month = "Сентябрь";
                break;
            case 10:
                month = "Октябрь";
                break;
            case 11:
                month = "Ноябрь";
                break;
            case 12:
                month = "Декабрь";
                break;
            default:
                errorMessage();
        }
        if (month != null) {
            System.out.println(month);
        }
    }

    private void errorMessage() {
        System.err.println("Введите корректное число");
    }
}
