import java.util.ArrayDeque;
import java.util.Deque;

class Tester {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
    Deque<Character> resultStack = new ArrayDeque<>();
    
    // Move elements from inputStack to resultStack to reverse the order
    while (!inputStack.isEmpty()) {
        char ch = inputStack.pop();
        resultStack.push(ch);
    }
    
    return resultStack;
}

	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');
		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
}
