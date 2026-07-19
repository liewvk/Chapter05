import java.util.Scanner;

public class InteractiveStudentProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter course: ");
        String course = input.nextLine();

        System.out.print("Enter average mark: ");
        double averageMark = input.nextDouble();

        System.out.println();
        System.out.println("Student Profile");
        System.out.println("---------------");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Course      : " + course);
        System.out.printf("Average Mark: %.2f%n", averageMark);

        input.close();
    }
}
