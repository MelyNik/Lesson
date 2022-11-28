package Java_S_L.Seminar.Seminar_1;

import java.time.LocalTime;
import java.util.Scanner;

public class proj_3 {
    public static void main(String[] args) {
        System.out.printf("Введите имя: ");
        Scanner qwe = new Scanner(System.in);
        String name = qwe.nextLine();
        int nowtime = LocalTime.now().getHour(); // Вывод только времени, где getHour() позволяет 
                                                 // вывести только часы и сразу getHour() преобразовывает
                                                 // в int.
        // int nowtime = LocalTime.of(4,0,0).getHour(); Принудительынй ввод времени.
        
        if(nowtime >= 12 && nowtime < 18)
            {
                System.out.printf("%s, Добрый день!\n",name); // java proj_2.java
            }
        else if(nowtime >= 18 && nowtime < 23)
            {
                System.out.printf("%s, Добрый вечер!\n",name);
            }
        else if(nowtime >= 5 && nowtime < 12)
            {
                System.out.printf("%s, Доброе утро!\n",name);
            }
        else
            {
                System.out.printf("%s, Доброй ночи!\n",name);
            }


            // Или:

            // System.out.printf("Введите имя: ");
            // String name = input.nextLine();
            // LocalTime nowtime = LocalTime.now();
            // LocalTime morning = LocalTime.of(5, 0, 0);
            // LocalTime day = LocalTime.of(12, 0, 0);
            // LocalTime evening = LocalTime.of(18, 0, 0);
            // LocalTime night = LocalTime.of(23, 0, 0);
            // if (nowtime.isAfter(morning) && nowtime.isBefore(day))
            //     {
            //         System.out.printf("%s, Доброе утро!\n",name);
            //     }
            // if (nowtime.isAfter(day) && nowtime.isBefore(evening))
            //     {
            //         System.out.printf("%s, Добрый день!\n",name);
            //     }
            // if (nowtime.isAfter(evening) && nowtime.isBefore(night))
            //     {
            //         System.out.printf("%s, Добрый вечер!\n",name);
            //     }
            // if (nowtime.isAfter(night) && nowtime.isBefore(morning))
            //     {
            //         System.out.printf("%s, Доброй ночи!\n",name);
            //     }

    }
}
