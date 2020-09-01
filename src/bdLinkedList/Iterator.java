package bdLinkedList;

import bdLinkedList.BiDirectionalLinkedList;

public class Iterator<T> {
    BiDirectionalLinkedList<T> list;
    BiDirectionalLinkedList.Link<T> current; //у итератора всегда есть ссылка на текущий элемент

    public Iterator(BiDirectionalLinkedList<T> list) {
        this.list = list;
        reset();
    }

    void reset(){
        current = list.first;
    }

    void resetToLast(){
        current = list.last;
    }

    boolean hasNext(){
        return current.next != null;
    }

    boolean hasPrev(){
        return current.prev != null;
    }

    public T next(){
        T data = current.data;
        current = current.next;
        return data;
    }

    public T prev(){
        T data = current.data;
        current = current.prev;
        return data;
    }
}
