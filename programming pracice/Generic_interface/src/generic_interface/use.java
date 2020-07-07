/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic_interface;

/**
 *
 * @author Threats
 */
public class use <T extends Comparable<T> > implements En{
    T []data;
    T size;
    
    use(T[]data)
    {
        this.data=data;
        
        
    }
    void setSize(T size)
    {
        this.size=size;
    }

    @Override
    public T min() {
        T value=data[0];
        for(int i=0;i<data.length;i++)
            if(data[i].compareTo(value)<0)value=data[i];
        return value;
    }

    @Override
    public T max() {
 T value=data[0];
        for(int i=0;i<data.length;i++)
            if(data[i].compareTo(value)>0)value=data[i];
        return value;
    }
    
}
