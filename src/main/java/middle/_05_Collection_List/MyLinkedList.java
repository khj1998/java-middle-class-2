package middle._05_Collection_List;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(E o) {
        if (first == null) {
            this.first = new Node<>(o);
            last = this.first;
        } else {
            Node<E> lastNode = getLastNode();
            Node<E> newNode = new Node<>(o);
            lastNode.next = newNode;
            newNode.prev = lastNode;
            this.last = lastNode.next;
        }

        size ++;
    }

    @Override
    public E set(int index,E element) {
        Node<E> node = getNode(index);
        E oldValue = node.item;
        node.item = element;

        return oldValue;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;

        for (Node<E> x = first; x!= null; x=x.next) {
            if (x.item.equals(o)) {
                return index;
            }
            index ++;
        }

        return -1;
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);

        if (index == 0) {
            if (first == null) {
                this.add(e);
                return;
            } else {
                newNode.next = first;
                first.prev = newNode;
                first = newNode;
            }
        } else {
            Node<E> node = getNode(index);
            Node<E> prev = node.prev;

            prev.next = newNode;
            newNode.prev = prev;

            newNode.next = node;
            node.prev = newNode;
        }

        size ++;
    }

    @Override
    public E get(int index) {
        return this.getNode(index).item;
    }

    @Override
    public E remove(int index) {
        checkIndexBound(index);

        Node<E> removedNode = getNode(index);
        E removedItem = removedNode.item;

        if (index == 0) {
            first = removedNode.next;
        } else {
            if (removedNode == last) {
                this.last = removedNode.prev;
            } else {
                Node<E> prev = removedNode.prev;
                prev.next = removedNode.next;
                removedNode.next.prev = prev;
            }
        }

        removedNode.item = null;
        removedNode.next = null;
        size --;

        return removedItem;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" + "first="+first+", size="+size+"}";
    }

    private void checkIndexBound(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("Index Out Of Bound!");
        }
    }

    private Node<E> getLastNode() {
        return this.last;
    }

    private Node<E> getNode(int index) {
        Node<E> now = this.first;

        for (int i =0; i<index; i++) {
            now = now.next;
        }

        return now;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;

            sb.append("[");

            while (x!=null) {
                sb.append(x.item);
                sb.append("->");
                x = x.next;
            }

            sb.append("]");

            return sb.toString();
        }
    }
}
