import java.util.Scanner;

public class Calculator
{
    private static Scanner iz = new Scanner(System.in);

    public static void main(String [] args)
{
    System.out.println("Enter first and Second number: ");
    double num1 = iz.nextDouble();
    double num2 = iz.nextDouble();

    System.out.println("Choose and Enter thet type of operation you want to perform (+, -, *, /, or exit) : ");
    char op = iz.next() . charAt(0);
    solve(num1, num2, op);
    System.out.println("")
}
public static double solve(double num1, double num2, char op)
{
    double ans= 0;

    if (op == '+') {
        ans = num1 + num2;
    }

    else if (op == '-') {
        ans = num1 - num2;
    }
    else if (op == '*') {
        ans = num1 * num2;
    }
    else if (op == '/') {
        ans = num1 / num2;
    }

    System.out.println("Your answer is :" + ans);
    return ans;
}
}
