using System;



    class Program
    {
        static int fibcal(int n) {
            if (n <= 1)
                return n;
            return fibcal(n - 1) + fibcal(n - 2);
        }
        static void Main(string[] args)
        {
            Console.WriteLine("FibcResult:"+fibcal(8));
            Console.ReadKey();
        }
    }

