package fundamentals.mainTasks.reverseOrder;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class ReverseOrder {
    public static void main(String[] args) {
        System.out.println("Arguments:");
        for (String arg : args) {
            System.out.print(arg);
        }
        System.out.println("\nReverse arguments: ");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i]);
        }
    }
}
