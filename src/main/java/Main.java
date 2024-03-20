import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1, num2;
    char operator;

    System.out.print("Enter the first number: ");
    num1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
      num2 = scanner.nextInt();

    System.out.print("Enter the operator (+, -, *, /): ");
    operator = scanner.next().charAt(0);

    switch (operator) {
      case '+':
        System.out.println("Result: " + (num1 + num2));
        break;
      case '-':
        System.out.println("Result: " + (num1 - num2));
        break;
      case '*':
        System.out.println("Result: " + (num1 * num2));
        break;
      case '/':
        if (num2 == 0) {
          System.out.println("Error: Division by zero");
        } else {
          System.out.println("Result: " + (num1 / num2));
        }
        break;
        default:
          System.out.println("Error: Invalid operator");
          break;
    }
  
  }
}