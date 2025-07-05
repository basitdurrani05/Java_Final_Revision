// Queue


// 1). Array
// 2). Collection Framework (Intenally)


// Queue is a Linear Data Structure

// It folows FIFO (FAST IN FIRST OUT)


// Type : 

// 1). Enqueue
// 2). Priority
// 3). Circular

// Opeartion : 

// 1) Offer  - Similar to Push
// 2) Poll   - Similar to pop

import java.util.*;

public class forth_dsa {


    public static void main(String[] args) {

        // Queue<Integer> a = new LinkedList<>();

        Queue<Integer> a = new PriorityQueue<>();

        a.offer(12);
        a.offer(13);
        a.offer(14);

        // a.poll();
        // a.poll();

        System.out.println(a);

    }
    
}
