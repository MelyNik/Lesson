package Java_S_L.Lectures.Lesson_1;
// Начало программы это class и main,
/**
 * Project
 */
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Project {
    public static void main(String[] args) {
        System.out.println("bye world"); // Лучше sysout
        // java Project.java

        String s ="2"; //Или null
        System.out.println(s);

        float e = 2.7f; // Вещественное число. Если пишем вещественное число через float, то ставим f.
        double rt = 3.145; // Вещественное число. Если пишем вещественное число через double, то ничего
                           // не ставим. Но при желании можно поставить D.
        System.out.println(e);
        System.out.println((rt));

        char h = '{';
        System.out.println(h);

        // Если поместить в char число, то при выводе оно приобразуется, в данном случае 123 преобразуются в {
        char gh = 123;
        System.out.println(gh);

        // А так же можно преобразовать целое число в вещественное способом ниже.

        int a = 123;
        double q = a;
        System.out.println(q);
        // Но обратно int a = q преобразовать не получится, надо использовать преобразование.

        // Вывод операторов истина или лож.
        boolean w = true && false; // или 123 <= 15 так же будет false.
        System.out.println(w);

        // Дизюнкция ^ - кода одно из значений истина.
        boolean r = true ^ false; // Вывод будет true.
        System.out.println(r);
        
        String t ="Hello world"; //Или null. Строки.
        System.out.println(t);

        
        var y = 123; // Автоматически выбирает наиболее подходящий тип данных.
        System.out.println(y);
        
        System.out.println(Integer.MAX_VALUE); // Обёртка, т.е. если нужно, что то узнать об этом типе данных
                                               // необходимо пользоваться обёрткой.
        // int - Integer
        // short - Short 
        // long - Long 
        // byte - Byte 
        // float - Float 
        // double - Double 
        // char - Character 
        // boolean - Boolean 
        
        String i = "qwer";
        i.charAt(1); // Выборка элемента массива с индексом 1.

        // ++ инкремент.
        // -- декремент.

        int o = 123;
        System.out.println(o++); // Вывели 123 ещё без увелечения и только потом увеличили на +1.
        System.out.println(o); // А теперь вывели уже 124.

        System.out.println(++o); // Если сделать так, то сначало увеличится на +1, а потом будет вывод.

        int p = 18;
        // 10010
        System.out.println(p >> 1); // Побитовый сдвиг. Можно сдвинуть в другую сторону p << 1.
        // Вывод 1001 и число теперь будет другое не 18, а 9.
        
        int g = 5; // В двоичном представлении 101.
        int j = 2; // В двоичном представлении 10.
        System.out.println(g | j); // Вывод 7.
        // 101
        // 010
        // 111

        int k = 5; // В двоичном представлении 101.
        int l = 2; // В двоичном представлении 10.
        System.out.println(k & l); // Вывод 7.
        // 101
        // 010
        // 000

        g = 5; // В двоичном представлении 101.
        j = 2; // В двоичном представлении 10.
        System.out.println(g | j); // Вывод 7.
        // 101
        // 010
        // 111

        int z = 5; // В двоичном представлении 101.
        int x = 2; // В двоичном представлении 10.
        System.out.println(z ^ x); // Вывод 7.
        // 101
        // 010
        // 111

        boolean zq = true; 
        boolean xx = true; 
        System.out.println(zq & xx); 
        // 1
        // 0
        // 0
        
        String mqr = "qwe11";
        // boolean b = mqr.length() >= 5 && mqr.charAt(4) == 1; С двумя оперсандами проверяет только левую часть.
        boolean b = mqr.length() >= 5 & mqr.charAt(4) == 1; // С одной оперсандой проверяет и левую и правую.
        System.out.println(b); 
        
        // boolean b = mqr.length() >= 5 || mqr.charAt(4) == 1; Работает так же, но в зависимости от того
        // дизюнкция это или, что либо.
        // boolean b = mqr.length() >= 5 | mqr.charAt(4) == 1; Работает так же, но в зависимости от того
        // дизюнкция это или, что либо.


        int[] arr = new int[10]; 
        arr[3] = 13;
        System.out.println(arr[3]);

        // Или так.

        int[] arr1 = new int[]{1, 2, 3, 5, 7, 2}; 
        System.out.println(arr1[3]);

        // // Можно написать несколько вариантов:
        // int[] arr3;
        // int arr4[];

        // //Многомерные массивы.
        // int[] arr5[] = new int [3][5];
        // int [][] arr6 = new int [3][5];
        

        // В Java нельзя положить в массив вещественных числе массив из целых чисел.



        // Что бы получать данные от пользователя, нужно до классов ввести следующее:
        // import java.util.Scanner;
        // А далее:
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine(); // String.
        // System.out.printf("Привет, %s!\n", name);
        // iScanner.close();
        
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int: ");
        // int name1 = iScanner.nextInt(); //int.
        // System.out.println(name1);
        // iScanner.close();

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: \n");
        String name = iScanner.nextLine(); // String.
        System.out.printf("Привет, %s!\n", name);

        System.out.printf("int: \n");
        int name1 = iScanner.nextInt(); //int.

        System.out.printf("double: \n");
        double name2 = iScanner.nextDouble(); //double.

        System.out.printf("",name1, name2);
        //// Проверка на ошибку ввода.
        System.out.printf("int: ");
        boolean flag = iScanner.hasNextInt(); // Проверка, что пользователь вводит целое число.
        System.out.println(flag); //
        // int qwer = iScanner.nextInt();
        // System.out.println(qwer);
        iScanner.close();
        
        String qaw = "qwe";
        int as = 2;
        String res = qaw + as; // Не явное преобразование as. Но лучше так int в строку не переводить,
                               // так как загружает очень много памяти.
        System.out.println(res);


        // Формат вывода.
        int io = 1, ol = 2;
        int ok = io + ol;
        String res1 = String.format("%d + %d = %d \n", ol, io, ok); // В строку res1 присволи строку
                                                                            // где левая часть попорядку вытягивает
                                                                            // информацию из правой части, т.е.
                                                                            // если в правой части поменять очерёдности 
                                                                            // переменных то и вывод будет уже изменён.
        System.out.printf("%d + %d = %d \n", io, ol, ok); // Вывод напрямую. А \n используем для того
                                                                 // что бы не было слитно с предыдущей строкой
                                                                 // а выгрзилось на следующей.

        // Ниже таблица для каких значений какой процент подставлять.
        // %d - Целые числа.
        // %x - Шестнадцатеричные числа.
        // %f - Для целых числе с плавающей точкой.
        // %e - Для вывода чисел в экспонентной форме, например 3.1415у+01
        // %c - Для вывода одиночного символа.
        // %s - Для вывода строковых значения.
       
        System.out.println(res1);
        // Как пример
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3.141500
        System.out.printf("%.2f\n", pi); // 3.14 Командой .2f сообщаем сколько хотим видеть знаков после точуки.
        System.out.printf("%.3f\n", pi); // 3.141
        System.out.printf("%e\n", pi); // 3.141500e+00
        System.out.printf("%.2e\n", pi); // 3.14+00 Командой .2e сообщаем сколько хотим видеть знаков после точуки.
        System.out.printf("%.3e\n", pi); // 3.141+00
        

        // Переменной можно пользоваться после отдельного блока, а не до:
        // Так нельзя:
        // int a2 = 123;
        // {
        //     int a2 = 456;
        //     System.out.println(a2);
        // }
        // Так можно:
        {
            int a2 = 123;
            System.out.println(a2);
        }
        int a2 = 456;
        System.out.println(a2);
        // Т.е. то, что с наружи может быть использовано внутри, то, что внутри не может быть использована с наружи.




        // Фукции:
        // Перед каждой  функцией пишем statick public.

        // Вызов функции:
        prog();
        // Или из отдельного файла:
        lib.prog1();


        // Теренарный оператор:
        int a3 = 4, b3 = 5;
        int min = a3 < b3 ? a3 : b3; // Если a3 меньше b3,  то к переменной min присвоется a3, если нет, то b3.
        System.out.println(min);



        // Оператор выбора:
        int qr = 123;
        switch (qr){
            case 1: // Т.е. если будет равно от 1 до 4 включительно, то проваливаемся в пункт под case 4.
            case 2: // Т.е. если будет равно от 1 до 4 включительно, то проваливаемся в пункт под case 4.
            case 3: // Т.е. если будет равно от 1 до 4 включительно, то проваливаемся в пункт под case 4.
            case 4: // Т.е. если будет равно от 1 до 4 включительно, то проваливаемся в пункт под case 4.
                System.out.println(qr);
                break;
            case 5:
                System.out.println("b");
                break;
            default:
                break;
            }

        // Цикл Whiel:
        
        int balue = 321;
        int count = 0;
        while (balue != 0) 
            {
                balue /= 10;
                count++;
            }
        System.out.println(count);

        // Цикл Do Whiel:
        
        int balue1 = 321;
        int count1 = 0;
        // Смысл в том, что сначало делаем потом проверяем.
        do
            {
                balue1 /= 10;
                count1++;
            }
        while (balue1 != 0);
        System.out.println(count1);

        

        // Цикл for с объяснением continue:
        for(int i1 = 0; i1 < 0; i1++)
            {
                if(i1 % 2 == 0)
                {
                    continue; // Означает если уловие выполнено, т.е. равно 0, то вниз не продолжаем выполнять
                              // программу а опять запускаем сверху но уже с увеличенным i1.
                }
                System.out.println(i1);
            }
        // break будет работать так же, т.е. когда он вызывается цикл прекращается.
        // а если будет цикл в цикле, то прекратится цикл, в котром находится break.
        
        
        // Цикл for in.

        int arr5[] = new int[]{1,2,3,4,5,77};
        for (int item : arr5) // Т.е. переменной item проходим по каждому элементу массива arr5.
            {
                System.out.println(item); // Вывод будет 6 строк 1, 2, 3, 4, 5, 77 именно переменной item,
                                          // к которой каждый раз присваивается новый элемент массива.
            }
        

        // Работа с файлами.
        // Импортируем следующее:
        // import java.io.FileWriter;
        // import java.io.IOException;
        
        // К переменной fw присваиваем файл с адресом.
        // В аргумент пишем false или true в зависимости будет ли в файл, что то дописывать или нет. 
        try (FileWriter fw = new FileWriter("file.txt", false)) 
            {
                fw.write("line 1"); // В первую строку записываем "line 1"
                fw.append("\n"); // Далее переходим но новую строку.
                fw.append("2"); // В следующей сроке пишем 2.
                fw.append("\n"); // Далее переходим но новую строку.
                fw.write("line 3"); // В следующей сроке пишем line 3.
                fw.flush(); // Принудительно записываем.
            }  
        catch (IOException ex) // Если Произошла какая-то ошибка,
            {
                System.out.println(ex.getMessage()); // то на экран выводим сообщение, что за ошибка что бы
                                                     // понять, что делать.
            } 
        

        // Читать из текста посимвольно.

        // import java.io *
        
        // public static void main (String[] args) throws Exception {
        //     FileReader fr = new FileReader("file.txt"); // К переменной fr присваиваем файл с адресом.
        //     int c4;
        //     while ((c4 = fr.read()) != -1)
        //         {
        //             char ch1 = (char) c4;
        //             if (ch1 == '\n')
        //                 {
        //                     System.out.println(ch1);
        //                 }
        //             else
        //                 {
        //                     System.out.println(ch1);
        //                 }
        //         }
        //
        //    }
        

        // Вариант построчно:
        // throws Exception означает, что ожидаем ошибку вместо try catch. 
        // public static void main(String[] args) throws Exception {
        //     BufferedReader br = new BufferedReader(new FileReader("file.txt")); // К переменной br присваиваем файл с адресом.
        //     String str;
        //     while ((str = br.readLine()) != null)
        //         {
        //             System.out.printf("== %s ==\n", str);
        //         }
        //     br.close();
        // }


        }

    
    
    // Фукции:
    // Перед каждой  функцией пишем statick public.
    static public void prog() {
        System.out.println("hello");
    }
}


// 
// 
// 
// 
// 
// 
// 
// 