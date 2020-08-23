using System;

namespace CommonDividor
{
    class Program
    {
      static  int gcd(int number1,int number2) {
            if (number2 == 0)
                return number1;
            return gcd(number2,number1%number2);
        }
        static void Main(string[] args)
        {
            int number1 = int.Parse(Console.ReadLine());
            int number2 = int.Parse(Console.ReadLine());
            int result = gcd(number1,number2);
            Console.WriteLine(result);

        }
    }
}
