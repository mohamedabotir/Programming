#include<iostream>
using std::cin;
using std::cout;
int gcd(int number1,int number2){
	if(number2==0)
		return number1;
	return gcd(number2,number1%number2);
}
long long Least_common_Multiple(int number1,int number2){
	return (long long)(number1*number2)/gcd(number1,number2);
}
int main(){
	cout<<Least_common_Multiple(761457,614573);
	

}