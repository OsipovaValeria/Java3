package Java;

import java.util.LinkedList;
import java.util.List;
/**
 * Класс, вызывающий основные методы коллекции LinkedList
 * @author Осипова Валерия (3 курс 7 группа)
 */
public class LinkedListWork {
    /** Поле LinkedList */
    public List<Integer> linkedList;
    /**
     * Конструктор LinkedList
     */
    public LinkedListWork() {
        linkedList = new LinkedList<>();
    }
    /**
     * Метод подсчета времени для заполнения LinkedList
     * @param count - количество элементов
     * @return возвращает время, необходимое для заполнения
     */
    public long timeFillLinkedList(int count) {
        long startTime = System.nanoTime();
        for(int i = 0; i < count; i++)
            linkedList.add(i);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод подсчета времени для удаления элемента из LinkedList
     * @param index - индекс элемента для удаления
     * @return возвращает время, необходимое для удаления элемента
     */
    public long timeDelete(int index) {
        long startTime = System.nanoTime();
        linkedList.remove(index);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод подсчета времени для добавления элемента в LinkedList
     * @param index - индекс элемента для добавления
     * @return возвращает время, необходимое для добавления элемента
     */
    public long timeAdd(int index) {
        long startTime = System.nanoTime();
        linkedList.add(index,1);
        return System.nanoTime() - startTime;
    }
    /**
     * Метод подсчета времени для получения элемента из LinkedList
     * @param index - индекс элемента для получения
     * @return возвращает время, необходимое для получения элемента
     */
    public long timeGet(int index) {
        long startTime = System.nanoTime();
        int item = linkedList.get(index);
        return System.nanoTime() - startTime;
    }
}