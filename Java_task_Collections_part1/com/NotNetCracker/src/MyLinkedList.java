import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
   transient private int size = 0;
   transient private Node<E> first;
   transient private Node<E> last;

    public MyLinkedList() {}

    private static class Node<E> {
        private E element;
        private Node<E> nextNode;

        Node(E element) {
          this.element = element;
        }
        Node(){};
    }

    @Override
    public void add(E element) {
        final Node<E> temp = new Node<E>();
        temp.element = element;
        if(last == null){
            first = temp;
            last = temp;
        }
        else{
            last.nextNode = temp;
            last = temp;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        checkPositionIndex(index);
        if(index == size){
            add(element);
        }
        else{
            Node<E> node1 = new Node<>(element);
            int counter = 0;
            Node<E> temp = first;
            while (counter < index -1){
                temp = temp.nextNode;
                counter++;
            }
            node1.nextNode = temp.nextNode;
            temp.nextNode = node1;
        }
        size++;
    }

    @Override
    public void clear() {
        for(Node<E> temp = first; temp != null;){
            Node<E> next = temp.nextNode;
            temp.nextNode = null;
            temp.element = null;
            temp = next;
        }
        first = null;
        last = null;
    }

    @Override
    public E get(int index) {
        checkPositionIndex(index);
        Node<E> temp = first;
        int counter = 0;
        while(counter < index ){
            temp = temp.nextNode;
            counter++;
        }
        return temp.element;
    }

    @Override
    public int indexOf(E element) {
        Node<E> temp = first;
        int counter = 0;
        while(counter < size){
            if(temp.element.equals(element)){
                return counter;
            }
            temp = temp.nextNode;
            counter++;
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkPositionIndex(index);
        Node<E> temp1 = first;
        Node<E> temp2;
        int counter = 0;
        while(counter < index-1){
            temp1 = temp1.nextNode;
            counter++;
        }
        Node<E> result = temp1.nextNode;
        temp2 = temp1.nextNode.nextNode;
        temp1.nextNode = temp2;
        size--;
        return result.element;
    }

    @Override
    public E set(int index, E element) {
        checkPositionIndex(index);
        Node<E> temp1 = first;
        E temp;
        int counter = 0;
        while(counter < index){
            temp1 = temp1.nextNode;
            counter++;
        }
        temp = temp1.element;
        temp1.element = element;
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
}
