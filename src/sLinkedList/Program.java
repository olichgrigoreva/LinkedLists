package sLinkedList;

public class Program {
    public static void main(String[] args) {
        SimpleLinkedLists simpleLinkedLists = new SimpleLinkedLists();
        simpleLinkedLists.insertFirst(1, 0);
        simpleLinkedLists.insertFirst(2, 0);
        simpleLinkedLists.insertFirst(3, 1.2);

        simpleLinkedLists.printList(); //список вывелся в обратном порядке, т.к. добавляли всегда в начало

        SimpleLinkedLists simpleLinkedLists2 = new SimpleLinkedLists();
        simpleLinkedLists2.insertLast(1, 0);
        simpleLinkedLists2.insertLast(2, 0);
        simpleLinkedLists2.insertLast(3, 1.2);
        simpleLinkedLists2.insertFirst(0, 0.5);

        System.out.println();
        simpleLinkedLists2.printList(); //выведется с 0 по 3 элемент

        SimpleLinkedLists.Link link = simpleLinkedLists2.deleteFirst();
        System.out.print("из списка был удален элемент: " + link + "\n");
        simpleLinkedLists2.printList();
    }
}
