
import java.util.Scanner;

public class StudentMarksArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[9];
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / (double) marks.length;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

    }
}
