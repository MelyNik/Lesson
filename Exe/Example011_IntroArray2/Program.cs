﻿// Задача c функцией и массивом.

int[] array = { 15, 12, 3, 43, 25, 6, 75, 25, 34 };

int n = array.Length; // Возвращает длину или количество элементов массива

int find = 25;

int index = 0;

while (index < n)
{
    if (array[index] == find)
    {
        Console.WriteLine(index);
        break;        // Означает, что если в массиве как в данном случае 2 одниковых 
                      // числа 25, то после данной команды найдя первое совпадение, 
                      // счётчик прервётся и программа остановиться.
    }
    index++;
}