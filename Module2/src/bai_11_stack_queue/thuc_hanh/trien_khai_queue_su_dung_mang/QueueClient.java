package bai_11_stack_queue.thuc_hanh.trien_khai_queue_su_dung_mang;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.string();
        queue.enqueue(56);
        queue.string();

        queue.enqueue(2);
        queue.string();

        queue.enqueue(67);
        queue.string();

        queue.dequeue();
        queue.string();

        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
        queue.enqueue(435);
    }
}
