using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LeastCommonMultipleCSharp
{
    class Program
    {
     static   ulong gcd(ulong number1,ulong number2){
	if(number2==0)
		return number1;
	return gcd(number2,number1%number2);
}
static ulong  Least_common_Multiple(ulong number1,ulong number2){
	return (ulong )(number1*number2)/gcd(number1,number2);
}
        static void Main(string[] args)
{
    string[] tokens = Console.ReadLine().Split();

    ulong number1 = ulong.Parse(tokens[0]);

    ulong number2 = ulong.Parse(tokens[1]);
           
            Console.WriteLine(Least_common_Multiple(number1, number2));
        }
    }
}
