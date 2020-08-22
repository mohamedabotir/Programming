using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication8
{
    class Program
    {
        static void Main(string[] args)
        {
            
            car p = new car();
            p.setManufacture("Chevorlet");
            p.setName("oxida black");
            p.setModel(62);
            p.setPrice(125180.60);
            Console.WriteLine("Car\t\t\t\tModel\tTax\tPrice");
                Console.WriteLine("{0}\t\t{1}\t{2}\t{3:c}", p.getManufacture()+" "+p.getName(), p.getModel(), p.f(2)+"%", p.getPrice());
               
            Console.ReadKey();
        }
    }
}
