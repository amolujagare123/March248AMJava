package CollecctionsDemo.QueueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDeQueueDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offer(11);
        adq.offer(45);
        adq.offer(14);
        adq.offer(90);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollLast();
        adq.pollFirst();

        System.out.println(adq);


    }
}
