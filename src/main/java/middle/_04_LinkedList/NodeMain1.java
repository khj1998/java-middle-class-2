package middle._04_LinkedList;

public class NodeMain1 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        Node now = first;

        while(now != null) {
            System.out.println(now.item.toString());
            now = now.next;
        }
    }
}
