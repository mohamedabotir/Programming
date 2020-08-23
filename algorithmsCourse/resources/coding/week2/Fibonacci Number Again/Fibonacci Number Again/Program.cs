using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fibonacci_Number_Again
{
    class Program
    {
        static Int64[] fibonacci(Int64 number, float mode)
        {
            Int64[] data = new Int64[number + 2];
        data[0]=0;
            data[1]=1;
            for (int i = 2; i < data.Length;i++ )
            {
                data[i] = (Int64)(((data[i - 1]) + (data[i - 2])) % mode);
            }
            
            return data;

        }
        static void Main(string[] args)
        {
            string[] LineSpliter = Console.ReadLine().Split();
            Int64 fibN = Int64.Parse(LineSpliter[0]);
            float mode = float.Parse(LineSpliter[1]);
            Int64[] data = fibonacci(fibN, mode);
            Console.WriteLine(data[fibN]);
        }
    }
}
