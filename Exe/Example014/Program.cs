// Вид 1 (Просто, что то выводит на экран).
void Method1()
{
    Console.WriteLine("Автор ....");
}
// Вызываются.
Method1();

// Вид 2 (Ни чего не возвращают, но принимают).
void Method2(string msg) // Первый способ.
{
    Console.WriteLine(msg);
}
// Вызывается.
Method2("Текст сообщения");

void Method21(string msg, int count) // Второй способ.
{
    int i = 0;
    while (i < count)
    {
        Console.WriteLine(msg);
        i++;
    }
}
Method21(msg: "Текст", count: 4); // Означает, что именно к string msg запросили "Текст" и 4 отночится именно к count. 

// Вид 3 Если, что-то возвращшаем.
int Method3()
{
    return DateTime.Now.Year; // Команда вернуть сегодняшний год.
}

int year = Method3();
Console.WriteLine(year);

// Вид 4.1 Что-то принимают и что-то возвращают.

string Method4(int count, string text)
{
    int i = 0;
    string result = string.Empty; // Означает, что result сейчас пустая строка.
    while (i < count)
    {
        result = result + text;
        i++;
    }
    return result;
}

string res = Method4(10, "asdf"); // Это значит, что мы складываем текст 10 раз.
Console.WriteLine(res);

// Вид 4.2 
string Method4(int count, string text)
{
    string result = string.Empty; // Означает, что result сейчас пустая строка.
    for (int i = 0; i < 10; i++) // Сокращает видимость кода.
    {
        result = result + text;
    }
    return result;
}
string res = Method4(10, "asdf"); // Это значит, что мы складываем текст 10 раз.
Console.WriteLine(res);

// Задача на цикл в цикле (таблица умножения).

for (int i = 2; i <= 10; i++)
{
    for (int j = 2; j <= 10; j++)
    {
        Console.WriteLine($"{i} * {j} = {i * j}");
    }
    Console.WriteLine();
}






