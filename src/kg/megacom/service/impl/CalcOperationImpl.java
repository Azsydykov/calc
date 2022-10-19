package kg.megacom.service.impl;

import kg.megacom.service.CalcOperation;

import java.util.Scanner;

public class CalcOperationImpl implements CalcOperation {

    Scanner scanner = new Scanner(System.in);

    @Override
    public double getDouble() {
        System.out.print("Введите число: ");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе данных, попробуйте еще раз");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    @Override
    public char getOperation() {
        System.out.print("Введите операцию: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе данных, попробуйте еще раз");
            scanner.next();
            operation = getOperation();
        }
        return operation;

    }

    @Override
    public double calc(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не разпознана. Повторите ввод!");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
