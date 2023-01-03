package collections.List;
import java.util.LinkedList;   
import java.util.*;


public class LearnLinkedList {
    public static void main(String[] args) {
        // linked list implements both queue and list interface 
        Queue<Integer> queue = new LinkedList<>();
       // List<Integer> queue2 = new LinkedList<>(); does not contains offer(add), poll(delete) method 
        queue.offer(12);
        queue.offer(23);
        queue.offer(34);
      
        System.out.println(queue);
        System.out.println(queue.poll());
        queue.peek(); // used to find first element in stack
 
    }
}
