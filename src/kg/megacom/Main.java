package kg.megacom;

import kg.megacom.service.CalcOperation;
import kg.megacom.service.impl.CalcOperationImpl;

public class Main {
    public static void main(String[] args) {

        CalcOperation calcOperation = new CalcOperationImpl();

        double num1 = calcOperation.getDouble();
        double num2 = calcOperation.getDouble();
        char operation = calcOperation.getOperation();
        double result = calcOperation.calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);

    }
}
