import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.*;
public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		 
		  Deque<Integer> d = new ArrayDeque<>();
 
        // Dequeue the first k elements of the queue and
        // push them onto a deque
        for (int i = 0; i < k; i++) {
            d.push(input.poll());
        }
 
        // Pop the elements from the deque and enqueue them
        // back into the queue
        while (!d.isEmpty()) {
            input.add(d.pop());
        }
 
        // Dequeue the remaining elements from the queue and
        // enqueue them back into the queue
        for (int i = 0; i < input.size() - k; i++) {
            input.add(input.poll());
        }
		return input;
    }
	}

