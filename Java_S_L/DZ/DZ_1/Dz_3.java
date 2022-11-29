package Java_S_L.DZ.DZ_1;
// Реализовать простой калькулятор.
import java.util.Scanner;
public class Dz_3 {
    public static void main(String[] args) {
        Scanner message = new Scanner(System.in);
        System.out.printf("Добро пожаловать в калькулятор! \n");
        System.out.printf("Введите первое число: \n");
        float number_1 = check();
        while(number_1 < 0)
            {
                number_1 = check();
            }
        
        System.out.printf("Введите второе число: \n");
        float number_2 = check();
        while(number_2 < 0)
            {
                number_2 = check();
            }

        System.out.println("Введите один из наков операции (+, -, /, //, %, *, **):");
        String symbol = Symbol();
        while(symbol == "!")
            {
                symbol = Symbol();
            }

        float result = 0;
        if(symbol.equals("+"))
            {
                result = number_1 + number_2;
            }
        else if(symbol.equals("-"))
            {
                result = number_1 - number_2;
            }
        else if(symbol.equals("/"))
            {
                result = number_1 / number_2;
            }
        else if(symbol.equals("//"))
            {
                int num_1 = (int)number_1;
                int num_2 = (int)number_2;
                result = num_1 / num_2;
            }
        else if(symbol.equals("%"))
            {
                result = number_1 % number_2;
            }
        else if(symbol.equals("*"))
            {
                result = number_1 * number_2;
            }
        else if(symbol.equals("**"))
            {
                double num_1 = (double)number_1;
                double num_2 = (double)number_2;
                result = (float)Math.pow(num_1, num_2);
            } 
        System.out.printf("%.2f %s %.2f = %.2f\n", number_1, symbol, number_2, result);
    }
    static float check () {
        Scanner number = new Scanner(System.in);
        boolean flag = number.hasNextFloat();
		if (flag == true) {
            float N = number.nextFloat();
            return N;
		}
        else{
            System.out.printf ("Ошибка ввода! Введите повторно: \n");
            return -1;
		}
    }
    static String Symbol () {
        Scanner number = new Scanner(System.in);
        String text = number.nextLine();
        if (text.equals("+") || text.equals("-") || text.equals("/") || text.equals("//") || text.equals("%") || text.equals("*") || text.equals("**")) 
            {
                return text;
		    }
        else
            {
            System.out.printf ("Ошибка ввода! Введите повторно: \n");
            return "!";
		    }
    }
}
