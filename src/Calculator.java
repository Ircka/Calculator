import java.util.Scanner;
public class Calculator {
        Scanner scan = new Scanner(System.in);
    public int getInt() {
        System.out.println("Введите целое число для выполнения операции: ");
        int num;
        if(scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("При введении допущена ошибка, попробуйте еще раз.");
            scan.next(); // не совсем понимаю почему без этого здесь зацыкливается, а в следующем нет
            num = getInt();
        }
        return num;
    }

    public char getOperation() {
        System.out.println("Введите требуемую операцию. Доступны: + - х % ");
        char tryOperation = scan.next().charAt(0); // тут вводиться может несколько символов, а проверяет первый, не айс
        char operation;
        if (checkOperation(tryOperation)) {
            operation = tryOperation;
        } else {
            System.out.println("При введении операции допущена ошибка, попробуйте еще раз.");
            //scan.next();
            operation = getOperation();
        }
        return operation;
    }
    private boolean checkOperation(char o) {
        return o == '+' || o == '-' || o == '%' || o == 'x';
    }

    public int calc (int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '%':
                result = num1 / num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            default:
                System.out.println("Произошло то, что я считала невозможным, сообщите программисту, что вы сделали");
                result = getInt();
        }
        return result;
    }
}
