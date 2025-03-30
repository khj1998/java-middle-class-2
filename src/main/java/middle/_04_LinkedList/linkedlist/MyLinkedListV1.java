package middle._04_LinkedList.linkedlist;

public class MyLinkedListV1 {
    private Node first;
    private int size = 0;

    public void add(Object o) {
        if (first == null) {
            this.first = new Node(o);
        } else {
            Node lastNode = getLastNode();
            lastNode.next = new Node(o);
        }

        size ++;
    }

    public Object set(int index,Object element) {
        Node node = getNode(index);
        Object oldValue = node.item;
        node.item = element;

        return oldValue;
    }

    public Object getItem(int index) {
        Node node = getNode(index);
        return node.item;
    }

    public int indexOf(Object o) {
        int index = 0;

        for (Node x = first; x.next != null; x=x.next) {
            if (x.item.equals(o)) {
                return index;
            }
            index ++;
        }

        return -1;
    }

    private Node getLastNode() {
        Node now = this.first;

        while (now.next != null) {
            now = now.next;
        }

        return now;
    }

    private Node getNode(int index) {
        Node now = this.first;

        for (int i =0; i<index; i++) {
            now = now.next;
        }

        return now;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" + "first="+first+", size="+size+"}";
    }
}
