#include<iostream>
using std::cout;
using std::cin;
using std::endl;

int main(){
	 double number;
	cin>>number;
	
	 double  number1=0;
	 double number2=1;
	 double sum=0;
	int count=0;
	while(number>=1)
	{ 
		
		
		{
		count++;
		number1=number2;
		number2=sum;
		sum=number1+number2;
		number--;
		
		}
	}
	cout<<(int)sum<<endl;
}