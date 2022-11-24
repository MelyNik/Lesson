package Java_S_L.Lectures.Lesson_1;
// Начало программы это class и main,
/**
 * Project
 */
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

        // Можно написать несколько вариантов:
        int[] arr3;
        int arr4[];

        //Многомерные массивы.
        int[] arr5[] = new int [3][5];
        int [][] arr6 = new int [3][5];
        

        

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