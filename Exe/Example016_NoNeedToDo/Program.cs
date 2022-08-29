// Полезные ссылки
// https://docs.microsoft.com/ru-ru/dotnet/csharp/language-reference/keywords/
// https://docs.swift.org/swift-book/ReferenceManual/LexicalStructure.html
// https://docs.microsoft.com/en-us/dotnet/standard/design-guidelines/

//var isEven = require('is-even');
//
//isEven(0);
////=> true
//isEven('1');
////=> false
//isEven(2);
////=> true
//isEven('3');
////=> false

// Так:
// int i = 12;                            // Можно понять какой сейчас тип системы, а именно System.Int32,
// Console.WriteLine(i.GetType().Name);   // Name позволяет вывести только Int32.

// Или так:

using System.Linq;

var i = 12;                             // var сам определяет какой тип данных используем.
Console.WriteLine(i.GetType().Name);

var data = new int[] { 1, 2, 3, 4 }
            .Where(e => e > 0)
            .Select(e => new { q = e, w = e + 1 });
Console.WriteLine(data.GetType());


