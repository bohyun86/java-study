package class0.ex;

import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;
    char op;

    void inputNumbers() {
        // 두 정수 입력
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("number1 : ");
        num1 = scanner.nextInt();
        System.out.print("number2 : ");
        num2 = scanner.nextInt();

        // 연산자 입력
        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next().charAt(0);
    }

    void calculation() {
        switch(op) {
            case '+':
                System.out.println("Result: " + add());
                break;
            case '-':
                System.out.println("Result: " + subtract());
                break;
            case '*':
                System.out.println("Result: " + multiply());
                break;
            case '/':
                System.out.println("Result: " + divide());
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }

    int add() {
        return num1 + num2;
    }

    int subtract() {
        return num1 - num2;
    }

    int multiply() {
        return num1 * num2;
    }

    double divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) num1 / num2;
    }


}
