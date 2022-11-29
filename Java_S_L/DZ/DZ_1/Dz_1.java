package Java_S_L.DZ.DZ_1;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Dz_1 {
    public static void main(String[] args) {
        System.out.println("Введите n треугольного числа: ");
		int number = check();
		while (number < 0)
            {
		        System.out.printf("Ошибка!!! Введите положительное число: \n");
		        number = check();
		    }
		System.out.printf("Треугольное число T%d равно %d \n", number, triangular(number));
		System.out.printf("Произведение чисел от 1 до %d равено %d", number, factorial(number));
    }
    static int check () {
        Scanner number = new Scanner(System.in);
        boolean flag = number.hasNextInt();
		if (flag == true) 
            {
                int N = number.nextInt();
                return N;
		    }
        else{
            System.out.printf ("Ошибка ввода! Повторите! \n");
            return -1;
		    }
    }
    static int triangular(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++)
            {
		        sum+= i;
            }
        return sum;
    }
    static int factorial(int number) {
        int mult = 1;
        for (int i = 1; i <= number; i++)
            {
		        mult*= i;
            }
        return mult;
    }
}
