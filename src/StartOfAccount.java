public class StartOfAccount {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в мой первый калькулятор!");
        Calculator calculator = new Calculator();
        int num1 = calculator.getInt();
        char operation = calculator.getOperation();
        int num2 = calculator.getInt();
        System.out.println("Ответ: " + calculator.calc(num1, num2, operation));
    }
}
