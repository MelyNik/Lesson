﻿/*
Задача 2.
Упорядочить массив.
Название одно из алгоритмов - Алгоритм сортировки методом выбора.
Дан массив : 6 8 3 2 1 4 5 7.
Процесс решения:
Нужно поменять местами значение первого элемента "6" с индексом "0" на минимальный элемент, 
в данном случае это "1" с индексом "4".
Далее нужно продолжить и второй элемент массива "8" с индексом 1, заменить на минимальный элемент
в оставшемся массиве слева на право, в данном случае это элемент "2" с индексом "3".
И так далее пока не отсортируем массив.

Задача звучит так:
1. Найти позицию максимального элемента в неотсортированной части массива.
2. Произвести обмен этого значения со значением первой неотсортированной позиции.
3. Повторять пока есть не отсортированные элементы.
*/

void PrintArray(int[] array)
{
    for(int i=0; i<array.Length; i++)
    {
        Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
}

void FromMaximumToMinimum(int[] array)
{
    for(int i=0; i<array.Length; i++)
    {
        int max=i;
        for (int j =i; j<array.Length; j++)
        {
            if(array[j]>array[max])
            {
                max = j;
            }
        }
        int variable = array[i];
        array[i] = array[max];
        array[max]= variable;
    }
}

int[] arr = { 51, 1, 35, 42, 63, 412, 1, 2, 6, 8, 1, 54, 85, 47 };
PrintArray(arr);

FromMaximumToMinimum(arr);
PrintArray(arr);