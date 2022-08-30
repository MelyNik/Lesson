/*
Предоставлена программа, которую нужно улучшить:

const Double пи = 3.1415;
int k__BackingField ;
void set_MyProperty(int value)
{
    k__BackingField = value;
}
int get_MyProperty()
{
    return k__BackingField;
}
int MyProperty {get; set;}
*/
// Улучшение:
/*
const Double pi = 3.1415; // Изменил на pi, так как киридица недопустима удалили Double (пишется с маленькой буквы), 
                          // так как конкретно для числа pi уже существует тип данных const. 
int k__BackingField ;     // Нижнее подчёркивание не приветствуется в с# и нужно придумать наиминование переменной попроще.
void set_MyProperty(int value) // Функция указано с маленькой буквы и нижнее подчёркивание не приветствуется в с# и 
                               // нужно придумать наиминование функции попроще.
{
    k__BackingField = value; // Нижнее подчёркивание не приветствуется в с# и нужно придумать наиминование переменной попроще.
}
int get_MyProperty() // Функция указано с маленькой буквы и нижнее подчёркивание не приветствуется в с# и 
                     // нужно придумать наиминование функции попроще.
{
    return k__BackingField; // Нижнее подчёркивание не приветствуется в с# и нужно придумать наиминование переменной попроще.
}
int MyProperty {get; set;} // MyProperty не даёт понимая, что происходит, нужно изменить название для понимания.

// А самое главное, что код в принципе не рабочий и нет смысла его разбирать.
*/
/*
Ссылки как нужно иминовать функции, переменные, классы и тд.
https://docs.microsoft.com/ru-ru/dotnet/csharp/fundamentals/coding-style/identifier-names
https://docs.microsoft.com/ru-ru/dotnet/csharp/fundamentals/coding-style/coding-conventions
*/
/*
Предоставлена программа, которую нужно улучшить:
*/
/*
void DrawText(string text, int left, int top)
{
    Console.SetCursorPosition(left,top);
    Console.WriteLine(text);
}

DrawText("Intensive C# Demo text", 629, 360);
*/
// Улучшение:
/*
void DrawText(string text, int left, int top)
{
    Console.SetCursorPosition(left,top);
    Console.WriteLine(text);
}

DrawText("Intensive C# Demo text", 629, 360); //629 и 360 означают:
                                              // 629 - пусть ширина экрана будет 1280px, тогда середина 1280/2 == 640
                                              //      в тексте "Intensive C# Demo text" 22 символа, что бы отцентровать
                                              //      по ширине нужно от центральной точки отступить половину 
                                              //      выводимых символов.
                                              // т.к. ширина символа одинакова, получаем 1280/2 - 11 == 629
                                              //      пусть высота экрана 720px
                                              //      720/2 = 360.
*/
/*
// И лучше будет так:
DrawText(                        // Если в функции много аргументов, то что бы не забыть какая переменная
    text: caption,               // за пределами фукции относится к переменной в функции:
    left: screenWidthPosition,   // можно указывать пепменную в функции, далее указать двое точие(:), далее 
    top: screenHeigthPosition    // название переменной которую хотим вложить в функцию.
    );                           //

string caption = "Intensive C# Demo text"; // caption - подпись.
int screenWidthPosition = (Console.WindowWidnh - caption.Length) / 2; // screenWidthPosition - положение ширины экрана.
int screenHeigthPosition = Console.WindowHeigth / 2; // screenHeigthPosition - положение высоты экрана.

DrawText(caption, screenWidthPosition, screenHeigthPosition);
*/

/*
Как инициализировать строку:
Вариант1: string label = "";   - если в кратце, то это как к переменной int number присвоить 0 - int number = 0;         
Вариант2: string label = String.Empty;
Наиболее верный вариант  string label = String.Empty;
Так как первый вариант не понятен для того кто не пользуется C#.
*/

// Предоставлена программа, которую нужно улучшить:
// Пример 1:
/*
double a=1, b=-26, c=120;
var d = b*b-4*a*c;
double x1=(-b+Math.Sqrt(d)) / (2*a);
double x2=(-b-Math.Sqrt(d)) / (2*a);
Console.WriteLine($"x1 = {x1} x2 = {x2}");

// Пример 2:

a=2, b=1, c=-3;
d = b*b-4*a*c;
x1=(-b+Math.Sqrt(d)) / (2*a);
x2=(-b-Math.Sqrt(d)) / (2*a);
Console.WriteLine($"x1 = {x1} x2 = {x2}");

// Пример 3:

a=1, b=1, c=-6;
d = b*b-4*a*c;
x1=(-b+Math.Sqrt(d)) / (2*a);
x2=(-b-Math.Sqrt(d)) / (2*a);
Console.WriteLine($"x1 = {x1} x2 = {x2}");
*/
// Программа просит в случайных точках консоли вывести случайные числа.
/*
Random r = new Random();

Console.CursorVisible = false; // CursorVisible - курсор виден присвоили лож.
while(true) // Если правда, то.
{
    Console.SetCursorPosition(              // SetCursorPosition - Установите Положение Курсора.
        left: r.Next(Console.WindowWidth),  // Напомнили себе, что left: r.Next(Console.WindowWidth), где 
                                            // WindowWidth это ширина окана, в данном случае случайная.
        top: r.Next(Console.WindowHeight)   // Напомнили себе, что top: r.Next(Console.WindowHeight), где 
                                            // WindowHeight это высота окана, в данном случае случайная.
    );
    Console.Write(r.Next(10));
    Thread.Sleep(1000);
}
*/

// Парсинг входной строки.
// Увеличить каждую координату в 2 раза и выдать ответ.
using System.Linq; // Это модуль.

string text = "(1,2) (2,3) (4,5) (6,7)" // Координаты точек фигуры записанный строчкой.
                .Replace("(", "")       // Такая комманда, позволяет в заданном тексте 
                .Replace(")", "")       // убрать не нужные символы или ещё, что-то.
                ;                       // Т.е. мы убрали скобки и вмсето них указали пустую строку.
                // Убрали всё это для того, что бы остались одни числа, так как в дальнейшем будем
                // всё это преобразовывать в числа и тип данных int.

var data = text.Split(" ") // Или будет так же если мы напишем string[]. Т.е. тут мы создали массив.
                           // Split - позволяет сделать разбивку текста, где в данном случае будет разбивать
                           // в момент когда будет пробел (" ").
                .Select(item=>item.Split(',')) // Теперь мы хотим разделить условна на x и y уже существующие
// элементы. В команде .Select(item=>item.Split(',')) т.е. сообщаем выбери некий item и этот item разделит всё до ','.
// и после ','. Получается появились item1 и item2, то есть до и после ','.
                .Select(e=>(x: int.Parse(e[0]), y: int.Parse(e[1]))) // Ещё одна выборка, где мы создали
// аргумент e, который обозначет координаты x и y и массив data текстовый, превращаем в числовой int. 
// а преобразовали способом int.Parse(e[0]), int.Parse(e[1]) через запятую, сначало строки, потом столбцы.
// x и y означают, что мы присвоили к ним условно координаты.
                .Where(e=> e.x % 2 == 0) // Т.е. даллее если координата x четная то она уножится на 10 и вывидится
// остальбные уберутся, т.е. дальше работа продожется только с чётными.
                .Select(point => (point.x * 10, point.y)) // в данном случвае мы на постоянной указали что
// x будет всегда умножен на 10.
                .ToArray();// ToArray() - Превращает то, что мы уже получили в массив.
// Получается при выводе data у нас теперь массив состоящий из 4-х элементов, потому, что командой
// text.Split(" ") мы разделили на 4 части.
for(int i = 0;i<data.Length; i++)
{
    //Console.WriteLine(data[i].Item1*10); // Вывели массив с индексом i.
    //// Т.е. мы то, что было до ',', а именно Item1 умножили на 10.
    //// Или Item1 можем заменить на x, так как ранее указали, что x это теперь строки.
    Console.WriteLine(data[i]);
    Console.WriteLine();
}


