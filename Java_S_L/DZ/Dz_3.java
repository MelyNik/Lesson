package Java_S_L.DZ;
// Реализовать простой калькулятор.
import java.util.Scanner;
public class Dz_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Привет, это калькулятор.\nКакую операцию будем выполнять?\nВведи символ/ы (+, -, /, //, %, *, **)\n");
        String operation = iScanner.nextLine().strip();
        
        while (!(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("//") || operation.equals("%") || operation.equals("*") || operation.equals("**"))) {
            System.out.println("Некорректный ввод, попробуйте снова\nВведи символ/ы (+, -, /, //, %, *, **)\n");
            operation = iScanner.nextLine();
        }

        System.out.println("Введите первое число: ");
        float first_number = iScanner.nextFloat();
        System.out.println("Введите второе число: ");
        float second_number = iScanner.nextFloat();
        float result = 0;

        if (operation.equals("+")) {
         result = first_number + second_number;
         System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
        }
        else if (operation.equals("-")) {
            result = first_number - second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
        }
        else if (operation.equals("/")) {
            result = first_number / second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
        }
        else if (operation.equals("//")) {
            int a, b;
            a = (int)first_number;
            b = (int)second_number;
            result = a / b;
            System.out.printf(("%.2f %s %.2f = %.0f"), first_number, operation, second_number, result);
        }
        else if (operation.equals("%")) {
            int a, b;
            a = (int)first_number;
            b = (int)second_number;
            result = a % b;
            System.out.printf(("%.2f %s %.2f = %.0f"), first_number, operation, second_number, result);
        }
        else if (operation.equals("*")) {
            result = first_number * second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
        }
        else if (operation.equals("**")) {
            double a, b;
            a = (double)first_number;
            b = (double)second_number;
            result = (float)Math.pow(a, b);
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
        }
    }
}
