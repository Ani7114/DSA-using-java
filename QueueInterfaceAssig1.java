import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Patient {

	private String name;
	private String gender;
	private int age;
	
	public Patient(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.name+", Gender: "+this.gender+", Age: "+this.age;
	}
}


class Tester {
    
   public static List<Deque<Patient>> splitQueue(Deque<Patient> patientsQueue) {
    // Initialize two queues to hold senior and normal patients
    Deque<Patient> seniorQueue = new ArrayDeque<>();
    Deque<Patient> normalQueue = new ArrayDeque<>();
    
    // Iterate through the original queue and split patients based on age
    for (Patient patient : patientsQueue) {
        if (patient.getAge() >= 60) {
            seniorQueue.add(patient);
        } else {
            normalQueue.add(patient);
        }
    }
    
    // Create a list to store both queues
    List<Deque<Patient>> queuesList = new ArrayList<>();
    queuesList.add(seniorQueue);
    queuesList.add(normalQueue);
    
    return queuesList;
}


	public static void main(String[] args) {
		
		Patient patient1=new Patient("Jack","Male",25);
		Patient patient2=new Patient("Tom","Male",64);
		Patient patient3=new Patient("Simona","Female",24);

		Deque<Patient> patientsQueue = new ArrayDeque<Patient>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);

		List<Deque<Patient>> queuesList = splitQueue(patientsQueue);
		
		int counter=0;
		for (Deque<Patient> queue : queuesList) {
			if(counter==0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");
			
			for (Patient patient : queue) {
				System.out.println("Name : "+patient.getName());
				System.out.println("Age : "+patient.getAge());
				System.out.println();
			}
			counter++;
		}	
	}
	

}
