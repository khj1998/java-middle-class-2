package middle._04_LinkedList.linkedlist;

public class MyLinkedListV2 {
    private Node first;
    private Node last;
    private int size = 0;

    public void add(Object o) { //맨 마지막에 추가
        if (first == null) {
            this.first = new Node(o);
            last = this.first;
        } else {
            Node lastNode = getLastNode();
            Node newNode = new Node(o);
            lastNode.next = newNode;
            newNode.prev = lastNode;
            this.last = lastNode.next;
        }

        size ++;
    }

    public Object set(int index,Object element) {
        checkIndexBound(index);
        Node node = getNode(index);
        Object oldValue = node.item;
        node.item = element;

        return oldValue;
    }

    public int indexOf(Object o) {
        int index = 0;

        for (Node x = first; x!= null; x=x.next) {
            if (x.item.equals(o)) {
                return index;
            }
            index ++;
        }

        return -1;
    }

    public void add(int index, Object e) {
        checkIndexBound(index);
        Node newNode = new Node(e);

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
            Node node = getNode(index);
            Node prev = node.prev;

            prev.next = newNode;
            newNode.prev = prev;

            newNode.next = node;
            node.prev = newNode;
        }

        size ++;
    }

    public Object remove(int index) {
        checkIndexBound(index);

        Node removedNode = getNode(index);
        Object removedItem = removedNode.item;

        if (index == 0) {
            first = removedNode.next;
        } else {
            if (removedNode == last) {
                this.last = removedNode.prev;
            } else {
                Node prev = removedNode.prev;
                prev.next = removedNode.next;
                removedNode.next.prev = prev;
            }
        }

        removedNode.item = null;
        removedNode.next = null;
        size --;

        return removedItem;
    }

    public Node getLast() {
        return this.last;
    }

    private Node getLastNode() {
        return this.last;
    }

    private Node getNode(int index) {
        Node now = this.first;

        for (int i =0; i<index; i++) {
            now = now.next;
        }

        return now;
    }

    private void checkIndexBound(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException("Index Out Of Bound!");
        }
    }

    @Override
    public String toString() {
        return "MyLinkedListV2{" + "List="+first+", size="+size+"}" + "first value="+first.item+" last value="+last.item;
    }
}
