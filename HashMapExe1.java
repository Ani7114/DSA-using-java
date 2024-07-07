import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
        // Initialize variables to keep track of max and min scores
        Double maxScore = Double.MIN_VALUE;
        Double minScore = Double.MAX_VALUE;
        String maxScorer = null;
        String minScorer = null;
        
        // Iterate through the map entries to find max and min scorers
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            String student = entry.getKey();
            Double score = entry.getValue();
            
            // Update max scorer
            if (score > maxScore) {
                maxScore = score;
                maxScorer = student;
            }
            
            // Update min scorer
            if (score < minScore) {
                minScore = score;
                minScorer = student;
            }
        }
        
        // Create a new map to hold max and min scorers
        Map<String, Double> maxMinScorers = new HashMap<>();
        maxMinScorers.put(maxScorer, maxScore);
        maxMinScorers.put(minScorer, minScore);
        
        return maxMinScorers;
    }

}

class Tester {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}
