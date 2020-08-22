using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


    

    class Program
    {
        static void Main(string[] args)
        {
           // finfib(8);
            Console.WriteLine(fibonacci(9));
            Console.ReadKey();
        }
       static void finfib(int n) {
            int [] value = new int[n];
            value[0] = 0;
            value[1] = 1;
           
            for (int i = 2; i < n+1;i++ )
            {
                value[i] = value[i - 1] + value[i - 2];
              
            }
            for (int i = 0; i < n; i++)
                Console.WriteLine( value[i]+",");
            
        }
       static int fibonacci(int n  ) {
           if (n <= 1)
               return n;
           return fibonacci(n - 1) + fibonacci(n - 2);
       }
    }

