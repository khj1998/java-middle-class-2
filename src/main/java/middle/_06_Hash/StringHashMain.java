package middle._06_Hash;

public class StringHashMain {
    static int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = "+(int)charA);
        System.out.println("charB = "+(int)charB);

        System.out.println("hashCode('A') = "+hashCode("A"));
        System.out.println("hashCode('B') = "+hashCode("B"));
        System.out.println("hashCode('C') = "+hashCode("C"));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;

        for (char c : charArray) {
            sum = sum + (int) c;
        }

        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
