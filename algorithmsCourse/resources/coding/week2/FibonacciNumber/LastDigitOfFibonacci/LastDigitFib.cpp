#include<iostream>
using std::cout;
using std::cin;
using std::endl;

int main(){
int number;
	cin>>number;
	
	int number1=0;
	int number2=1;
	int sum=0;
	int count=0;
	int mode;
	while(number>=1)
	{ 
		
		
		{
		count++;
		number1=number2;
		number2=sum;
		sum=number1+number2;
		number--;
		if(number==0)
		mode=sum%10;
		}
	}
	cout<<mode;
}