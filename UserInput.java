import java.util.Scanner;

class UserInput {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String name = "";
        System.out.print("Please enter your name: ");
        name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("**********");

        int marks = 0;
        System.out.print("Please enter your maths marks: ");
        marks = scan.nextInt();
        System.out.println("Your maths marks is " + marks);

        System.out.println("**********");
    }
}