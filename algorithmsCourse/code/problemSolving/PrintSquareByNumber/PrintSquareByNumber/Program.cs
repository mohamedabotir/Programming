using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrintSquareByNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int val = 1;
            for(int i=0;i<8;i++)
            {
                for (int t = 128; t > 0; t /= 2) {
                    if ((val & t) != 0) Console.Write("1");
                    if ((val & t) == 0) Console.Write("0");
                }
                val=val<<1;
                Console.WriteLine();
            }
            Console.WriteLine("-------------------------------------------------------------");
            val = 128;
            for (int i = 0; i < 8; i++)
            {
                for (int t = 128; t > 0; t /= 2)
                {
                    if ((val & t) != 0) Console.Write("1");
                    if ((val & t) == 0) Console.Write("0");
                }
                val = val >> 1;
                Console.WriteLine();
            }
            Console.ReadKey();
        }
    }
}
