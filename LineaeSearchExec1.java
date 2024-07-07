class Tester {
	
	public static int searchElement(int[] elements, int elementToBeSearched) {
    int numberOfIterations = 0;
    
    for (int i = 0; i < elements.length; i++) {
        numberOfIterations++;
        if (elements[i] == elementToBeSearched) {
            return numberOfIterations;
        }
    }
    
    // If element is not found
    return -1;
}

	
	public static void main(String[] args) {
		int[] elements = { 76, 24, 78, 98, 1 };
		int elementToBeSearched = 78;
		
		int numberOfIterations = searchElement(elements, elementToBeSearched);
		
		if (numberOfIterations == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found! Number of iterations required to find the element : " + numberOfIterations);
	}
	
}
