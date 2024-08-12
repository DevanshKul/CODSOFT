import javax.sound.midi.Soundbank;
import java.lang.invoke.SwitchPoint;
import java.lang.reflect.AccessFlag;
import java.util.Scanner;
import java.util.SortedMap;

public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        int marks=0;
        double TotalMarks=0;
        double AveragePercentage;
        String Grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Student: ");
        String StName = sc.next();

        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numberofSubjects = number.nextInt();

        Scanner name = new Scanner(System.in);
        for (int i=0; i<numberofSubjects; i++){
            System.out.print("Enter the name of subject " + (i+1) + " : ");
            String nameofSubjects = sc.next();
        }

        for(int j=0; j<numberofSubjects; j++) {
            System.out.print("Enter marks for subject" + (j+1) + " : ");
            Scanner marksofStudents = new Scanner(System.in);
            marks = sc.nextInt();
            TotalMarks += marks;

        }

        AveragePercentage = TotalMarks / numberofSubjects;

        if (AveragePercentage >= 90){
            Grade = "A";
        } else if (AveragePercentage >= 80) {
            Grade = "B";
        } else if (AveragePercentage >= 70) {
            Grade = "C";
        } else if (AveragePercentage >= 60) {
            Grade = "D";
        } else {
            Grade = "F";
        }

        System.out.println("Name of the Students is : " + StName);
        System.out.println("Total Marks are : " + TotalMarks);
        System.out.println("Average Percentage is : " + AveragePercentage);
        System.out.println("Grade is : " + Grade);
    }
}
