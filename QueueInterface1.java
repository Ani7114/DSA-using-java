import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Object> mergeQueue(Deque<Integer> intQueue, Deque<Character> charQueue) {
        // Create a new Deque to store merged elements
        Deque<Object> mergedQueue = new ArrayDeque<>();

        // Add all elements from intQueue to mergedQueue
        for (Integer num : intQueue) {
            mergedQueue.add(num);
        }

        // Add all elements from charQueue to mergedQueue
        for (Character ch : charQueue) {
            mergedQueue.add(ch);
        }

        return mergedQueue;
    }

    public static void main(String[] args) {
        Deque<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.add(3);
        integerQueue.add(6);
        integerQueue.add(9);
        
        Deque<Character> characterQueue = new ArrayDeque<>();
        characterQueue.add('a');
        characterQueue.add('e');
        characterQueue.add('i');
        characterQueue.add('o');
        characterQueue.add('u');
        characterQueue.add('b');
        
        Deque<Object> mergedQueue = mergeQueue(integerQueue, characterQueue);
        
        System.out.println("The elements in the merged queue are:");
        for(Object element: mergedQueue) {
            System.out.println(element);
        }
    }
}
