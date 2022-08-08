// Задача c функцией и массивом.

int Max(int arg1, int arg2, int arg3)
{
    int result = arg1;
    if (arg2 > result) result = arg2;
    if (arg3 > result) result = arg3;
    return result;
}

//             0  1  2  3 4  5  6  7  8   -   это индексы 
int[] array = { 4, 10, 48, 88, 5, 52, 15, 11, 66 };

int max = Max(Max(array[0], array[1], array[2]),
              Max(array[3], array[4], array[5]),
              Max(array[6], array[7], array[8]));

// В данном случае мы сравнили в функции Max индексы конкретных чисел из массива.

Console.WriteLine($"Максимальное число: {max}");
