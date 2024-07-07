import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Tester {

    public static List<String> sortSales(Map<String, Integer> sales) {
        // Convert Map entries to List
        List<Entry<String, Integer>> entries = new ArrayList<>(sales.entrySet());

        // Sort entries based on sales (value) in descending order
        Collections.sort(entries, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Extract employee names into a new List
        List<String> sortedEmployees = entries.stream()
                                             .map(Entry::getKey)
                                             .collect(Collectors.toList());

        return sortedEmployees;
    }

    public static void main(String args[]) {
        Map<String, Integer> sales = new HashMap<>();
        sales.put("Mathew", 50);
        sales.put("Lisa", 76);
        sales.put("Courtney", 45);
        sales.put("David", 49);
        sales.put("Paul", 49);
        
        List<String> employees = sortSales(sales);
        
        System.out.println("Employees in the decreasing order of their sales\n=====================================");
        for (String employeeName : employees) {
            System.out.println(employeeName);
        }
    }
}
