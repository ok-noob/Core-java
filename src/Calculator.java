import java.util.Scanner;

public class Calculator{

    /*
        Hey, it's been so long left java but from now im going to try to keep it on track, and it's my first quick
        test. im creating a calculator using if-else for fun its really so easy and good to understand if-else concept.><
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//    Declaring Variables.
        int a, b, c;
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.print("Enter first number: ");
            a = sc.nextInt();

            System.out.print("Enter second number: ");
            b = sc.nextInt();

            System.out.println("Enter your operation: \n 1-> + \n 2-> - \n 3-> * \n 4-> / \n 5-> Exit");
            c = sc.nextInt();

            if (c == 1) {
                System.out.println("Addition = " + (a + b));
            }
            else if (c == 2) {
                System.out.println("Subtraction = " + (a - b));
            }
            else if (c == 3) {
                System.out.println("Multiplication = " + (a * b));
            }
            else if (c == 4) {
                if (b != 0) {
                    System.out.println("Division = " + (a / b));
                } else {
                    System.out.println("Error! Cannot divide by zero");
                }
            } else if (c == 5) {
                keepRunning = false;
                System.out.println("Exiting calculator");
            } else {
                System.out.println("INVALID CHOICE!! Try Again.");
            }
        }
        sc.close();
    }
}

