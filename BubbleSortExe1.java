class Tester {
	static int noOfSwaps = 0;
	static int noOfPasses = 0;

public static void swap(int[] elements, int firstIndex, int secondIndex) {
    int temp = elements[firstIndex];
    elements[firstIndex] = elements[secondIndex];
    elements[secondIndex] = temp;
    noOfSwaps++; // Increment swap count
}


	public static int bubbleSort(int[] elements) {
    int n = elements.length;
    boolean swapped;
    int passes = 0;
    
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        passes++;
        for (int j = 0; j < n - i - 1; j++) {
            if (elements[j] > elements[j + 1]) {
                swap(elements, j, j + 1);
                swapped = true;
            }
        }
        
        if (!swapped) {
            break; // If no elements were swapped, array is already sorted
        }
    }
    
    return passes;
}

	public static void displayArray(int[] elements) {
		for (int element : elements)
			System.out.print(element + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int[] elements = { 23, 67, 45, 76, 34, 68, 90 };

		System.out.println("Given array:");
		displayArray(elements);

		int noOfPasses = bubbleSort(elements);

		System.out.println("==========================");
		System.out.println("Total number of passes needed to sort the array: " + noOfPasses);
		System.out.println("==========================");

		System.out.println("Array after sorting:");
		displayArray(elements);

	}
}
