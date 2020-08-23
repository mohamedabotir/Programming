#include<iostream>
#include<new>
using namespace std;
int fib(int number){
	return number;
}
int main(){
int number;
	cin>>number;
	unsigned int  * p;
	p=new unsigned int [number];
	if(p==nullptr)
		cout<<"Error:MemoryCouldn't be allocate";
	p[0]=0;
	p[1]=1;
	for(int i=2;i<number;i++)
	{
	p[i]=p[i-1]+p[i-2];
	}
	cout<<p[number-1]%10;
   
	
}