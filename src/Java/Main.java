package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String f = "a";
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество вызовов методов:");

            try {
                int n = in.nextInt();
                ArrayListWork arrayList = new ArrayListWork(n); // @value arrayList - создание нового объекта типа ArrayListWork
                LinkedListWork linkedList = new LinkedListWork(); // @value linkedList - создание нового объекта типа LinkedListWork
                System.out.println(Result.header());
                System.out.println(Result.resultArrayList(n, arrayList));
                System.out.println(Result.resultLinkedList(n, linkedList));

            } catch (InputMismatchException ex) {
                System.out.println("Ошибка ввода.");
            }

            System.out.println("\nЧтобы продолжить, нажмите - a. \nЧтобы выйти, нажмите любую клавишу.");
            Scanner in2 = new Scanner(System.in);
            f = in2.nextLine();

        } while (f.equals("a"));
    }
}
