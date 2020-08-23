#include<iostream>
using std::cout;
using std::cin;
 
int main(){
	float *data ;
	long number;
	long mode;
	cin>>number;
	cin>>mode;
	data=new float[number + 2];
        data[0]=0;
            data[1]=1;
            for (int i = 2; i < number;i++ )
            {
                data[i] = (int)((data[i - 1]) + (data[i - 2])) % mode;
            }
			cout<<data[number];
}