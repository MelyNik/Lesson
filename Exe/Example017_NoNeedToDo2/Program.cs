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



