import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _03_ExamScore {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Map<Integer, TreeMap<String, Double>> examData = new TreeMap<>();
		
		for (int i = 0; i < 1000; i++) {
			//parse each line
			String line = scan.nextLine().replaceAll("[|]+", "").trim();
			
			//leave the loop if the last line is reached
			if (i > 3 && line.charAt(0) == '-') {
				break;
			}
			//split the string into variables and perform calculations
			if (i > 2) {				
				String[] input = line.split("\\s+");
				
				//the exam score is the key to examData
				int key = Integer.parseInt(input[2]);
				String student = input[0] + " " + input[1];				
				double grade = Double.parseDouble(input[3]);
					
				//store the data in the map
				if (examData.containsKey(key) == false) {
					TreeMap<String, Double> grades = new TreeMap<>();
					grades.put(student, grade);
					examData.put(key, grades);
				} else {
					TreeMap<String, Double> grades = examData.get(key);
					grades.put(student, grade);
					examData.put(key, grades);
				}
			}					
		}
		//print the result
		for (Integer score : examData.keySet()) {
			System.out.print(score + " -> [");
			
			TreeMap<String, Double> grades = examData.get(score);
			int studentsCount = grades.size();
			double sumOfGrades = 0;
			
			int count = grades.size();
			
			for (String student : grades.keySet()) {
				sumOfGrades += grades.get(student);
				count--;
				System.out.print(student);
				if (count > 0) {
					System.out.print(", ");
				} else {
					System.out.print("]; ");
				}
			}
			double averageGrade = sumOfGrades / studentsCount;
			System.out.printf("avg=%.2f", averageGrade);
			System.out.println();
		}
	}
}
