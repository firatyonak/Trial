import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Operator: ");
        String in = sc.next();
        char oper = in.charAt(0);

        System.out.print("Enter a number: ");
        in = sc.next();
        double num1 = Double.parseDouble(in);

        System.out.print("Enter another number: ");
        in = sc.next();
        double num2 = Double.parseDouble(in);

        if (oper == '+') {
            System.out.println(num1 + num2);
        } else if (oper == '-') {
            System.out.println(num1 - num2);
        } else if (oper == 'x') {
            System.out.println(num1 * num2);
        } else if (oper == '/') {
            System.out.println(num1 * num2);
        } else {
            System.out.println("Try again");
        }
        System.out.println("Hope this helped your mathmatical troubles!");
    }
}