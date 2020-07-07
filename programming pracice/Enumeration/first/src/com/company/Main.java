package com.company;

public class Main {
    enum type
    {
        chevrolet(1.7f), mercedes(900f), ferrari(3f),BMW(2.5f),Ford(1.5f);
private Float price;
        type(Float v) {
            this.price=v;
        }

        public Float getPrice() {
            return price;
        }
    }
    public  static void main(String args[])
    {
        type inst,in;
        System.out.println("Types Of Cars In our Store");
        type []Alltype=type.values();
        for (type e:Alltype)
            System.out.print(e+" Price:"+e.getPrice()+"\n");
        inst=type.BMW;
        in=type.valueOf("Ford");

        switch (inst)
        {
            case BMW:
                System.out.println("You are Choose BMW Price "+inst.getPrice()+" Million Dollars After Tax\n-----Details----\nModel:2567\nManufacture:Germany SecondRegion\nSupport:2026");
            break;
             case Ford:
                 System.out.println("Not Available now");
                 break;

            case ferrari:
                System.out.println("Not Available now");
                break;
            case chevrolet:
                System.out.println("Not Available now");
                break;
            case mercedes:
                System.out.println("Not Available now");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + inst);
        }
    }
}
