/*
Что важно при описании рекурсии ?
1. Условие выхода( т.е. понять когда рекурсия перестанет себя вызывать).
*/
// Задача 1. Собрать строку с числами от a до b, условие a<=b.

//Без рекурсии:

//string NumbersFor(int a, int b)
//{
//    string result = String.Empty;
//    for(int i = a; i <=b; i++)
//    {
//        result = result + $"{i}";
//    }
//    return result;
//}
//string result = NumbersFor(1,5);
//Console.WriteLine(result);

// С рекурсией:

//string NumbersRec(int a, int b)
//{
//    if(a+1<=b)
//    {
//        return $"{a} " + NumbersRec(a+1,b);
//    }
//    else
//    {
//        return $"{a}";
//    }
//}
//
//Console.WriteLine(NumbersRec(1,5));
//
//// Задача 2. Собрать строку с числами от a до b, условие a>=b.
//
////Без рекурсии:
//
//string NumbersFor(int a, int b)
//{
//    string result = String.Empty;
//    for(int i = a; i >= b; i--)
//    {
//        result = result + $"{i} ";
//    }
//    return result;
//}
//string result = NumbersFor(5,1);
//Console.WriteLine(result);
//
//// С рекурcией:
//
//string NumbersRec(int a, int b)
//{
//    if(a<=b)
//    {
//        return NumbersRec(a+1,b) + $"{a} ";
//    }
//    else
//    {
//        return String.Empty;
//    }
//}
//
//Console.WriteLine(NumbersRec(1,5));
//
//
//// Задача 3. Найти сумму чисел от 1 до n.
//
////Без рекурсии:
//
//int NumbersFor(int n)
//{
//    int result = 0;
//    for(int i = 0; i <=n; i++)
//    {
//        result = result + i;
//    }
//    return result;
//}
//
//Console.WriteLine(NumbersFor(10));
//
//// С рекурсией:
//
//int NumbersRec(int n)
//{
//    if(n==0)
//    {
//        return 0;
//    }
//    else
//    {
//        return n + NumbersRec(n-1);
//    }
//}
//
//Console.WriteLine(NumbersRec(10));

//// Задача 4. Факториал числа n.
//
////Без рекурсии:
//
//int NumbersFor(int n)
//{
//    int result = 1;
//    for(int i = 1; i <=n; i++)
//    {
//        result = result * i;
//    }
//    return result;
//}
//
//Console.WriteLine(NumbersFor(5));
//
//// С рекурсией:
//
//int NumbersRec(int n)
//{
//    if(n==1)
//    {
//        return 1;
//    }
//    else
//    {
//        return n * NumbersRec(n-1);
//    }
//}
//
//Console.WriteLine(NumbersRec(5));

//// Задача 5. Вычислить a в степени n.
//
////Без рекурсии:
//
//int NumbersFor(int a, int n)
//{
//    int result = a;
//    for(int i = 1; i<n; i++)
//    {
//        result = result * a;
//    }
//    return result;
//}
//
//Console.WriteLine(NumbersFor(3,5));
//
//// С рекурсией:
//
//int NumbersRec(int a, int n)
//{
//    //if(n==0)
//    //{
//    //    return 1;
//    //}
//    //else
//    //{
//    //    return a * NumbersRec(a, n-1);
//    //}
//    // ИЛИ
//    return n == 0 ? 1 : a * NumbersRec(a,n-1);
//}
//
//Console.WriteLine(NumbersRec(3,5));
//
//// Улучшенный вариант:
//
//int NumbersRecFOR(int a, int n)
//{
//    if(n==0)
//    {
//        return 1;
//    }
//    else if(n%2 == 0)
//    {
//        return NumbersRecFOR(a*a, n/2);
//    }
//    else
//    {
//        return NumbersRecFOR(a, n -1) * a;
//    }
//}

// Задача 6. Перебор слов.
// В некотором машинном алфавите имеются четыре буквы "а", "и", "с" и "в".
// Покажите все слова, состоящие из Т букв, которые можно построить из букв этого фалфавита.

// Однобуквенные слова:

//char[] s = { 'а', 'и', 'с', 'в' };
//int count = s.Length;
//int n = 1;
//for (int i = 0; i < count; i++)
//{
//    Console.WriteLine($"{n++,-5}{s[i]}");
//}

// Пяти буквенные (потому, что цикл в цикле в цикле в цикле в цикле).

// Без рекурсии:

//char[] s = { 'а', 'и', 'с', 'в' };
//int count = s.Length;
//int n = 1;
//for (int i = 0; i < count; i++)
//{
//    for (int j = 0; j < count; j++)
//    {
//        for (int k = 0; k < count; k++)
//        {
//            for (int l = 0; l < count; l++)
//            {
//                for (int e = 0; e < count; e++)
//            {
//                Console.WriteLine($"{n++,-5}{s[i]}{s[j]}{s[k]}{s[l]}{s[e]}");
//            }
//            }
//        }
//    }
//}

// С рекурсией:


//int n = 1;
//void FindWords(string alphabet, char[] word, int length = 0)
//{
//    if(length == word.Length)
//    {
//        Console.WriteLine($"{n++, -5} {new String(word)}");
//        return;
//    }
//    for(int i = 0; i<alphabet.Length;i++)
//    {
//        word[length] = alphabet[i];
//        FindWords(alphabet,word,length+1);
//    }
//}
//
//FindWords("аисв", new char[2]);

///// Что бы пользоваться нужной деректорией.

void CatalogInfo(string path, string indent = "")
{
    DirectoryInfo catalog = new DirectoryInfo(path);

    DirectoryInfo[] catalog = catalog.GetDirectories();
    for (int i = 0; i < catalog.Length; i++)
    {
        Console.WriteLine($"{indent}{catalog[i].Name}");
        CatalogInfo(catalogs[i].FullName, indent + " ");
    }

    FileInfo[] files = catalog.GetFiles();

    for (int i = 0; i < files.Length; i++)
    {
        Console.WriteLine($"{indent}{files[i]}.Name");
    }
}

string path = "";
CatalogInfo(path);
