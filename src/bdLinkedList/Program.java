package bdLinkedList;

public class Program {
    public static void main(String[] args) {
        BiDirectionalLinkedList<String> list = new BiDirectionalLinkedList<>();
        list.insertFirst("Добрый");
        list.insertFirst("вечер");
        //list.printList();
        list.insertLast("господа");
        list.printList();
        String s;
        while ((s = list.deleteFirst()) != null) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.printList();

        System.out.println("Вывод в обратном порядке: ");
        list.insertFirst("Добрый");
        list.insertFirst("вечер");
        list.insertLast("господа");
        while ((s = list.deleteLast()) != null) {
            System.out.print(s + " ");
        }

        //рабочий итератор в примерах кода
        /*System.out.println("\nIterator");
        list.insertFirst("Привет");
        list.insertFirst("Пока");
        list.insertLast("Господа");
        Iterator<String> iterator = list.iterator();
        Iterator<String> iterator2 = list.iterator();
        iterator2.resetToLast();
        while (iterator.hasNext()) {
            s = iterator.next();
            System.out.println(s);
        }*/
    }
}
