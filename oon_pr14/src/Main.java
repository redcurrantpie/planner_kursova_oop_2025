import java.util.*;

public class Main
{

    static final int SIZE = 100000;

    public static void main(String[] args)
    {
        System.out.println("Вставка в початок:");
        testInsertionAtStart(new ArrayList<>(), "ArrayList");
        testInsertionAtStart(new LinkedList<>(), "LinkedList");
        testInsertionAtStart(new ArrayDeque<>(), "ArrayDeque");

        System.out.println("\n=== Вставка в кінець ===");
        testInsertionAtEnd(new ArrayList<>(), "ArrayList");
        testInsertionAtEnd(new LinkedList<>(), "LinkedList");
        testInsertionAtEnd(new ArrayDeque<>(), "ArrayDeque");

        System.out.println("\n=== Вставка у випадкову позицію ===");
        testInsertionAtRandom(new ArrayList<>(), "ArrayList");
        testInsertionAtRandom(new LinkedList<>(), "LinkedList");

        System.out.println("\n=== Модифікація випадкових елементів ===");
        testModificationRandom(new ArrayList<>(Collections.nCopies(SIZE, 0.0)), "ArrayList");
        testModificationRandom(new LinkedList<>(Collections.nCopies(SIZE, 0.0)), "LinkedList");

        System.out.println("\n=== Видалення з початку ===");
        testRemovalFromStart(new ArrayList<>(createList()), "ArrayList");
        testRemovalFromStart(new LinkedList<>(createList()), "LinkedList");
        testRemovalFromStart(new ArrayDeque<>(createList()), "ArrayDeque");

        System.out.println("\n=== Видалення з кінця ===");
        testRemovalFromEnd(new ArrayList<>(createList()), "ArrayList");
        testRemovalFromEnd(new LinkedList<>(createList()), "LinkedList");
        testRemovalFromEnd(new ArrayDeque<>(createList()), "ArrayDeque");

        System.out.println("\n=== Видалення з випадкової позиції ===");
        testRemovalRandom(new ArrayList<>(createList()), "ArrayList");
        testRemovalRandom(new LinkedList<>(createList()), "LinkedList");
    }

    static List<Double> createList() {
        List<Double> list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) list.add(1.0);
        return list;
    }

    static void testInsertionAtStart(Collection<Double> col, String name) {
        long start = System.currentTimeMillis();
        if (col instanceof List) {
            List<Double> list = (List<Double>) col;
            for (int i = 0; i < SIZE; i++) list.add(0, 1.0);
        } else if (col instanceof Deque) {
            Deque<Double> deque = (Deque<Double>) col;
            for (int i = 0; i < SIZE; i++) deque.addFirst(1.0);
        }
        System.out.println(name + ": " + (System.currentTimeMillis() - start) + " ms");
    }

    static void testInsertionAtEnd(Collection<Double> col, String name) {
        long start = System.currentTimeMillis();
        if (col instanceof List) {
            List<Double> list = (List<Double>) col;
            for (int i = 0; i < SIZE; i++) list.add(1.0);
        } else if (col instanceof Deque) {
            Deque<Double> deque = (Deque<Double>) col;
            for (int i = 0; i < SIZE; i++) deque.addLast(1.0);
        }
        System.out.println(name + ": " + (System.currentTimeMillis() - start) + " ms");
    }

    static void testInsertionAtRandom(List<Double> list, String name) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            int pos = random.nextInt(i + 1);
            list.add(pos, 1.0);
        }
        System.out.println(name + ": " + (System.currentTimeMillis() - start) + " ms");
    }

    static void testModificationRandom(List<Double> list, String name) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            int pos = random.nextInt(SIZE);
            list.set(pos, 2.0);
        }
        System.out.println(name + ": " + (System.currentTimeMillis() - start) + " ms");
    }

    static void testRemovalFromStart(Collection<Double> col, String name) {
        long start = System.currentTimeMillis();
        if (col instanceof List) {
            List<Double> list = (List<Double>) col;
            for (int i = 0; i < SIZE; i++) list.remove(0);
        } else if (col instanceof Deque) {
            Deque<Double> deque = (Deque<Double>) col;
            for (int i = 0; i < SIZE; i++) deque.removeFirst();
        }
        System.out.println(name + ": " + (System.currentTimeMillis() - start) + " ms");
    }

    static void testRemovalFromEnd(Collection<Double> col, String name) {
        long start = System.currentTimeMillis();
        if (col instanceof List) {
            List<Double> list = (List<Double>) col;
            for (int i = list.size() - 1; i >= 0; i--) list.remove(i);
        } else if (col instanceof Deque) {
            Deque<Double> deque = (Deque<Double>) col;
            for (int i = 0; i < SIZE; i++) deque.removeLast();
        }
        System.out.println(name + ": " + (System.currentTimeMillis() - start) + " ms");
    }

    static void testRemovalRandom(List<Double> list, String name) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            int pos = random.nextInt(list.size());
            list.remove(pos);
        }
        System.out.println(name + ": " + (System.currentTimeMillis() - start) + " ms");
    }
}
