using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication8
{
    class car :sub
    {
        private static int id=0;
        private  string manufacture;
        private double price;
        private int model;
        private string name;
       public  car() {
            id++;
        }
        public int getModel() {
            return model;
        }
        public string  getName()
        {
            return name;
        }
       public int getID() {
            return id;
        }
       public string getManufacture()
       {
            return manufacture;
        }
       public double getPrice()
       {
            return price;
        }
       public void setPrice(int Price)
       {
            this.price = Price;
        }
       public void setManufacture(string manufacture)
        {
            this.manufacture = manufacture;
        }
       public void setPrice(double price)
       {
            this.price = price;
        }
       public void setName(string  name)
       {
           this.name = name;
       }
       public void setModel(int model)
       {
           this.model = model;
       }
        public override int f(int z){
            return z;        
        }
    }
    
}
