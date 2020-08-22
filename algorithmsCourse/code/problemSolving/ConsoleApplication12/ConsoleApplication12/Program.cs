
using System;

    class Program
    {
        static void Main(string[] args)
        {
            char c1 = 'a', c2 = 'b';
            c1 = (char)(c1 + c2);
            Console.WriteLine('a'+""+'b');
            Console.WriteLine("Result Root of {0} {1:##.##}",25,Math.Sqrt(25.0));
            Random s=new Random();
            byte key = 28;
            c1 = (char)(key ^ c1);
            c2 = (char)(key ^ c2);
            Console.WriteLine("Encoded Values:"+c1+" ,"+c2);
            c1 = (char)(key ^ c1);
            c2 = (char)(key ^ c2);
            int a = 12;
            a = a << 1;
            Console.WriteLine("decoded Values:" + c1 + " ," + c2);
            Console.WriteLine((2<<1)>>1);
            Console.WriteLine(1&1);
            Console.ReadKey();
        }
    }

