/**
 * реализация простого связного списка
 */
public class SimpleLinkedLists {
    Link first;
    Link last;

    static class Link {
        public int iData;
        public double dData;
        public Link next;

        @Override
        public String toString() {
            return "Link{" +
                    "iData=" + iData +
                    ", dData=" + dData +
                    '}';
        }
    }

    public SimpleLinkedLists() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        //голова не содержит данных
        return first == null;
    }

    //запись первого элемента
    public void insertFirst(int iData, double dData) {
        Link node = new Link(); //узел
        node.iData = iData;
        node.dData = dData;
        node.next = first; //ссылка на след. элемент - ссылка на голову
        first = node;
    }

    //просмотр содержимого списка
    public void printList() {
        Link currentNode = first;
        while (currentNode != null){
            System.out.println(currentNode);
            currentNode = currentNode.next;
        }
    }

    //O(n) до 1000 элементв
    public void insertLast(int iData, double dData){
        Link node = new Link();
        node.iData = iData;
        node.dData = dData;
        node.next = null;
        if (first == null){
            first = node;
        } else {
            Link currentNode = first;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }
}
