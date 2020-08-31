package bdLinkedList;

/**
 * двунаправленный список или дека
 * @param <T>
 */

public class BiDirectionalLinkedList<T> {
    Link<T> first;
    Link<T> last;
    static class Link<T>{
        T data;
        public Link next;
        public Link prev;
    }

    public BiDirectionalLinkedList(){
        first = null;
        last = null;
    }

    public void insertFirst(T data){
        Link<T> node = new Link<>();
        node.data = data;
        node.prev = null; //ссылка = null, т.к. это первый элемент
        node.next = first; //т.к. добавляем первый элемент
        first = node;
        if (isEmpty()){
            last = node;
        }
    }

    public boolean isEmpty() {
        //голова не содержит данных
        return first == null;
    }

    public T deleteFirst(){
        if (isEmpty()){
            return null;
        }
        T data = first.data;
        first = first.next;
        first.prev = null;
        return data;
    }

    public T deleteLast(){
        if (isEmpty()){
            return null;
        }
        T data = last.data;
        last = last.prev; //первый ссылается на предыдущий
        last.next = null;
        return data;
    }

    //просмотр содержимого списка
    public void printList() {
        Link currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "BiDirectionalLinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}
