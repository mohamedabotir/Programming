using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {

            int number = int.Parse(Console.ReadLine());
            double[] array = new double[number+2];
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i < array.Length; i++)
            {
                array[i] = (array[i - 1] + array[i - 2])%10;
            
            }
            Console.WriteLine( array[number]);


        }
    }
}

