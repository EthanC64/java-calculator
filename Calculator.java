public class Calculator {
    int num1 = 0;
    int num2 = 0;

    Calculator(int number1, int number2) {
        num1 = number1;
        num2 = number2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        return num1 / num2;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator(1, 3);

        System.out.println(calculator.add());

        Calculator subtract = new Calculator(5, 4);
        System.out.println(subtract.subtract());
        Calculator multiply = new Calculator(4, 9);
        System.out.println(multiply.multiply());
        Calculator divide = new Calculator(24, 4);
        System.out.println(divide.divide());

    }
}