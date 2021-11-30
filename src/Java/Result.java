package Java;

/**
 * Класс для запуска методов и печати результата.
 * @author Осипова Валерия (3 курс 7 группа)
 */

public class Result {
    /**
     * Конструктор PrintResult
     */
    private Result() {
    }
    /**
     * Метод для создания шапки таблицы
     * @return - возвращает шапку таблицы
     */
    public static String header() {
        String header = "";
        header += "Название метода                       Количество выполнений     Время выполнения";
        header += "\n\n-------------------------------------------------------------------------------\n";
        return header;
    }
    /**
     * Метод для создания строки с информацией о количестве и време выполнений для ArrayList
     * @param n - количество вызывов методов
     * @param arrayList - ArrayList
     * @return - возвращает строку с информацией о количестве и време выполнений для ArrayList
     */
    public static String resultArrayList(int n, ArrayListWork arrayList) {
        String resultArrayList = "";
        long count = 0; // Переменная для посчёта общего времени

        resultArrayList += "Заполнение ArrayList                  1";
        resultArrayList += "                         ";
        resultArrayList += arrayList.timeFillArrayList();

        resultArrayList += "\nУдаление элементов из ArrayList       " + n;
        for(int i = 0; i < 22; i++)
            resultArrayList += " ";
        for(int i = n - 1; i >= 0; i--)
            count += arrayList.timeDelete(i);
        resultArrayList += count;

        count = 0;
        resultArrayList += "\nДобавление элементов в ArrayList      " + n;
        for(int i = 0; i < 22; i++)
            resultArrayList += " ";
        for(int i = 0; i < n; i++)
            count += arrayList.timeAdd(i);
        resultArrayList += count;

        count = 0;
        resultArrayList += "\nПолучение элементов из ArrayList      " + n;
        for(int i = 0; i < 22; i++)
            resultArrayList += " ";
        for(int i = 0; i < n; i++)
            count += arrayList.timeGet(i);
        resultArrayList += count;

        return resultArrayList;
    }
    /**
     * Метод для создания строк с информацией о количестве и време выполнений для LinkedList
     * @param n - количество вызовов методов
     * @param linkedList - LinkedList
     * @return - возвращает строку с информацией о количестве и време выполнений для LinkedList
     */
    public static String resultLinkedList(int n, LinkedListWork linkedList) {
        String resultLinkedList = "";
        long count = 0; // Переменная для посчёта общего времени

        resultLinkedList += "\nЗаполнение LinkedList                 1";
        for(int i = 0; i < 25; i++)
            resultLinkedList += " ";
        resultLinkedList += linkedList.timeFillLinkedList(n);

        resultLinkedList += "\nУдаление элементов из LinkedList      " + n;
        for(int i = 0; i < 22; i++)
            resultLinkedList += " ";
        for(int i = n - 1; i >= 0; i--)
            count += linkedList.timeDelete(i);
        resultLinkedList += count;

        count = 0;
        resultLinkedList += "\nДобавление элементов в LinkedList     " + n;
        for(int i = 0; i < 22; i++)
            resultLinkedList += " ";
        for(int i = 0; i < n; i++)
            count += linkedList.timeAdd(i);
        resultLinkedList += count;

        count = 0;
        resultLinkedList += "\nПолучение элементов из LinkedList     " + n;
        for(int i = 0; i < 22; i++)
            resultLinkedList += " ";
        for(int i = 0; i < n; i++)
            count += linkedList.timeGet(i);
        resultLinkedList += count;

        return resultLinkedList;
    }
}
