package kg.megacom.service;

public interface CalcOperation {
    double getDouble();
    char getOperation();
    double calc(double num1, double num2, char operation);
}
