package Java_S_L.Seminar.Seminar_1;

import java.util.Scanner;

public class proj_5 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 7, 2, 4, 9, 1, 0};
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        for(int i = 0; i < array.length-1; i++)
            {
                if (array[i] == num)
                    {
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
            }

        for (int i: array)
            {
                System.out.printf("%d ", i);
            }
        System.out.println();
    }
}
