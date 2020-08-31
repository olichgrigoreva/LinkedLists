package bdLinkedList;

public class Program {
    public static void main(String[] args) {
        BiDirectionalLinkedList<String> list = new BiDirectionalLinkedList<>();
        list.insertFirst("Добрый");
        list.insertFirst("вечер");
        list.printList();
    }
}
