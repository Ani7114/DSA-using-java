import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester {

    public static Map<Character, Integer> findOccurrences(String input) {
        Map<Character, Integer> occurrenceMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (occurrenceMap.containsKey(ch)) {
                occurrenceMap.put(ch, occurrenceMap.get(ch) + 1);
            } else {
                occurrenceMap.put(ch, 1);
            }
        }

        return occurrenceMap;
    }
    
    public static void main(String args[]) {
        String input = "occurrence";
        Map<Character, Integer> occurrenceMap = findOccurrences(input);
        
        System.out.println("Occurrences of characters\n=======================");
        for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
