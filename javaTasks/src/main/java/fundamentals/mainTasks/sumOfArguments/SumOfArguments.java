package fundamentals.mainTasks.sumOfArguments;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму и вывести результат на консоль.

public class SumOfArguments {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println(sum);
    }
}
