package bdLinkedList;

/**
 * двунаправленный список или дека
 * @param <T>
 */

public class BiDirectionalLinkedList<T> {
    Link<T> first;
    Link<T> last;

    public static class Link<T>{
        T data;
        public Link next;
        public Link prev;
    }

    public BiDirectionalLinkedList(){
        first = null;
        last = null;
    }

    public void insertFirst(T data){ //O(n)
        Link<T> node = new Link<>();
        node.data = data;
        node.prev = null; //ссылка = null, т.к. это первый элемент
        node.next = first; //т.к. добавляем первый элемент
        if (isEmpty()){
            last = node;
        } else {
            first.prev = node;
        }
        first = node;
    }

    public void insertLast(T data) { //O(n)
        Link<T> node = new Link<>();
        node.data = data;
        node.prev = last;
        node.next = null; //т.к. этот элемент становится последним
        last.next = node;
        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
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
        if (!isEmpty()){
            first.prev = null;
        }
        return data;
    }

    public T deleteLast(){ //O(n)
        if (isEmpty()){
            return null;
        }
        T data = last.data;
        last = last.prev; //первый ссылается на предыдущий
        if (last == null){
            first = null;
        }
        if (!isEmpty()){
            last.next = null;
        }
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

    public Iterator<T> iterator(){
        return new Iterator<>(this); //новый экземпляр итератеро для текущего списка
    }
}
