import java.util.Scanner;

public class InteractiveMarksCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter mark 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = input.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println();
        System.out.println("Marks Report");
        System.out.println("------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Mark 1      : " + mark1);
        System.out.println("Mark 2      : " + mark2);
        System.out.println("Mark 3      : " + mark3);
        System.out.println("Total       : " + total);
        System.out.printf("Average     : %.2f%n", average);

        input.close();
    }
}
