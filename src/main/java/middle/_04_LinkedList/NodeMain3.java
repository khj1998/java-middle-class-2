package middle._04_LinkedList;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        Node indexNode = getNode(first,2);
        System.out.println("index2Node = "+indexNode);

        Node addedNode = add(first,"D");
        System.out.println(addedNode);
    }

    private static void printAll(Node node) {
        Node x = node;

        while (x != null) {
            System.out.println(node.item);
            x =  x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x= node;

        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    private static Node getNode(Node node,int index) {
        Node x = node;

        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    private static Node add(Node node,Object item) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(item);
        return node;
    }
}
