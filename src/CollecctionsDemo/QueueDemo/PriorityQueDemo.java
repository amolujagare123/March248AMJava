package CollecctionsDemo.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(11);
        pq.offer(45);
        pq.offer(14);
        pq.offer(90);

        System.out.println(pq); // 11 , 14, 23, 45 , 90

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
