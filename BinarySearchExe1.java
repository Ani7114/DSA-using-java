class Tester {
    
    public static int iterations = 0;
    
    public static int searchElement(int elements[], int low, int high, int elementToBeSearched)  {
        if (low > high) {
            return -1; // Element not found
        }
        
        iterations++;
        
        int mid = low + (high - low) / 2;
        
        if (elements[mid] == elementToBeSearched) {
            return mid; // Element found at mid
        } else if (elements[mid] > elementToBeSearched) {
            return searchElement(elements, low, mid - 1, elementToBeSearched); // Search left half
        } else {
            return searchElement(elements, mid + 1, high, elementToBeSearched); // Search right half
        }
    }
    
    public static void main(String[] args) {
        int[] elements = { 1, 23, 43, 46, 78, 90 };
        int elementToBeSearched = 43;
        
        int indexPosition = searchElement(elements, 0, elements.length - 1, elementToBeSearched);
        
        if (indexPosition == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index position " + indexPosition + "!");
        }
        
        System.out.println("Number of iterations: " + iterations);
    }
}
