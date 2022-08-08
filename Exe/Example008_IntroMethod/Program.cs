// Задача метдом стихийного подхода, т.е. без функций.

int a1 = 4;
int b1 = 10;
int c1 = 48;
int a2 = 88;
int b2 = 5;
int c2 = 52;
int a3 = 17;
int b3 = 11;
int c3 = 66;

int max = a1;

if (a2 > max) { max = a2; }
if (a3 > max) { max = a3; }
if (b1 > max) { max = b1; }
if (b2 > max) { max = b2; }
if (b3 > max) { max = b3; }
if (c1 > max) { max = c1; }
if (c2 > max) { max = c2; }
if (c3 > max) { max = c3; }

Console.WriteLine($"Максимальное число: {max}");