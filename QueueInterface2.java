import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
        // Edge case: If stack is empty or has only one element, return as is
        if (inputStack.isEmpty() || inputStack.size() == 1) {
            return inputStack;
        }

        // Step 1: Find the smallest element and its count
        int minElement = Integer.MAX_VALUE;
        int minCount = 0;

        for (Integer num : inputStack) {
            if (num < minElement) {
                minElement = num;
                minCount = 1;
            } else if (num == minElement) {
                minCount++;
            }
        }

        // Step 2: Find the largest element
        int maxElement = Integer.MIN_VALUE;

        for (Integer num : inputStack) {
            if (num > maxElement) {
                maxElement = num;
            }
        }

        // Step 3: Modify the stack by changing the smallest element to the largest element
        Deque<Integer> updatedStack = new ArrayDeque<>();
        boolean smallestChanged = false;

        for (Integer num : inputStack) {
            if (num == minElement && minCount > 0 && !smallestChanged) {
                updatedStack.push(maxElement);
                smallestChanged = true; // Ensure we only change the first occurrence
            } else {
                updatedStack.push(num);
            }
        }

        return updatedStack;
    }

    public static void main(String[] args) {
        Deque<Integer> inputStack = new ArrayDeque<>();
        inputStack.push(10);
        inputStack.push(8);
        inputStack.push(5);
        inputStack.push(12);
        inputStack.push(5);

        Deque<Integer> updatedStack = changeSmallest(inputStack);

        System.out.println("Stack After Modification:");
        for (Integer value : updatedStack) {
            System.out.println(value);
        }
    }
}
