package Java;

import java.util.ArrayList;
import java.util.List;
/**
 * Класс, вызывающий основные методы коллекции ArrayList
 * @author Осипова Валерия (3 курс 7 группа)
 */

public class ArrayListWork {
    /** Поле ArrayList */
    public List<Integer> arrayList;
    /** Поле размера arrayList */
    private final int size;
    /**
     * Конструктор ArrayList
     * @param s - размер
     */
    public ArrayListWork(int s) {
        size = s;
        arrayList = new ArrayList<>(size);
    }
    /**
     * Метод подсчета времени для заполнения ArrayList
     * @return возвращает время, необходимое для заполнения
     */
    public long timeFillArrayList() {
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++)
            arrayList.add(i);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод подсчета времени для удаления элемента из ArrayList
     * @param index - индекс элемента для удаления
     * @return возвращает время, необходимое для удаления элемента
     */
    public long timeDelete(int index) {
        long startTime = System.nanoTime();
        arrayList.remove(index);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод подсчета времени для добавления элемента в ArrayList
     * @param index - индекс элемента для добавления
     * @return возвращает время, необходимое для добавления элемента
     */
    public long timeAdd(int index) {
        long startTime = System.nanoTime();
        arrayList.add(index, 1);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод подсчета времени для получения элемента из ArrayList
     * @param index - индекс элемента для получения
     * @return возвращает время, необходимое для получения элемента
     */
    public long timeGet(int index) {
        long startTime = System.nanoTime();
        int item = arrayList.get(index);
        return System.nanoTime() - startTime;
    }
}
