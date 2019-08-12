package fundamentals.mainTasks.helloUser;

//Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        System.out.println("Введите свое имя");
        Scanner userNameScanner = new Scanner(System.in);
        String userName = userNameScanner.nextLine();
        System.out.println("Привет, " + userName);
    }
}
