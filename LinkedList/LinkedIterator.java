package LinkedList;

public class LinkedIterator {

    /*Методы для реализации
    reset()
    nextLink()
    getCurrent()
    atEnd()
    insertAfter()
    insertBefore()
    deleteCurrent()*/

    private Link current;
    private Link previous;
    private LinkedList list;

    public LinkedIterator(LinkedList list) {
        this.list = list;
        this.reset();
    }

    public void reset() {
        current = list.getFirst();
        previous = null;
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Link getCurrent() {
        return current;
    }
}