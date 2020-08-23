#include<iostream>
using std::cin;
using std::cout;
int Least_common_Dividor(int number1,int number2){
	
int count=2;
	if(number1>number2)
		count=number2+1;
	else if(number2>number1)
		count=number1+1;
	while(true)
	{
	if((count%number1==0)&&(count%number2==0))
	{
	return count;
	break;

	}
	count++;
	}
}
int main(){
	int number1;
	int number2;
	int result=Least_common_Dividor(761457,614573);
	cout<<result;

}