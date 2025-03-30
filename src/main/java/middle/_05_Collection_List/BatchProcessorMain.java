package middle._05_Collection_List;

public class BatchProcessorMain {
    public static void main(String[] args) throws Exception {
        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        BatchProcessor processor2 = new BatchProcessor(list2);
        processor2.logic(1_000_000);
    }
}
