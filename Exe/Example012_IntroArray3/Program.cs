void FillaArray(int[] collection)  // Void означает, что из этой функции мы ни чего 
                                   // не будем возвращать, т.е. в конце функции
                                   // не должно быть команды return.
{
    int length = collection.Length;
    int index = 0;
    while (index < length)
    {
        collection[index] = new Random().Next(1, 10);
        index++;
    }
}

void PrintArray(int[] col)
{
    int count = col.Length;
    int position = 0;
    while (position < count)
    {
        Console.WriteLine(col[position]);
        position++;
    }
}

int[] array = new int[10]; // Создали массив в котором 10 символов и по умолчанию
                           // в данный момент там одни 0.

FillaArray(array);
PrintArray(array);