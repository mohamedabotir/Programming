#include<iostream>
using std::cin;
using std::cout;
static  int gcd(int number1,int number2) {
            if (number2 == 0)
                return number1;
            return gcd(number2,number1%number2);
        }
int main(){


            int number1 ;
            int number2 ;
			cin>>number1;
			cin>>number2;
            int result = gcd(number1,number2);
            cout<<result;

        }

