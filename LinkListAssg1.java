import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Tester {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        // Create a LinkedList to store result with duplicates removed
        LinkedList<Integer> result = new LinkedList<>();

        // Iterate through the list
        for (Integer num : list) {
            // If element is not present in set, add it to both set and result
            if (!set.contains(num)) {
                set.add(num);
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String args[]) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(15);
        list.add(10);

        List<Integer> updatedList = removeDuplicates(list);

        System.out.println("Linked list without duplicates");
        for (Integer value : updatedList) {
            System.out.print(value + " ");
        }
    }

}
