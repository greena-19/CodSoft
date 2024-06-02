import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks obtained in Subject1: ");
        int subject1 = scanner.nextInt();
        
        System.out.print("Enter marks obtained in Subject2: ");
        int subject2 = scanner.nextInt();
        
        System.out.print("Enter marks obtained in Subject3: ");
        int subject3 = scanner.nextInt();
        
        int totalMarks = subject1 + subject2 + subject3;
        
        double averagePercentage = (double) totalMarks / 3;
        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
	} else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        System.out.println("Total marks obtained is : " + totalMarks);
        System.out.println("Average Percentage is : " + averagePercentage + "%");
        System.out.println("Grade obtained is : " + grade);
    }
}
