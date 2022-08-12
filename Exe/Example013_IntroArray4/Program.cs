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
        Console.Write($" {col[position] }");
        position++;
    }
}

int IndexOf(int[] collection, int find)
{
    int size = collection.Length;
    int count = 0;
    int position = -1;

    while (count < size)
    {
        if (collection[count] == find)
        {
            position = count;
            break;
        }
        count++;
    }
    return position;
}
int searchableValue = 4;
int arraySize = 10;

int[] array = new int[arraySize];

FillaArray(array);
PrintArray(array);
Console.WriteLine();               // Означает пропустить строку (т.е. вывести пустую).

int pos = IndexOf(array, searchableValue);

Console.WriteLine($"Позиция {searchableValue} {pos}");




