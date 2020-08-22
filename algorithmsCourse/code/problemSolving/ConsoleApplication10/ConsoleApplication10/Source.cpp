#include<iostream>
#include<vector>
using std::cin;
using std::cout;
using std::vector;
long long maxPairewise(const vector<int>&number){
	long long result=0;
	int size=number.size();
	for(int i=0;i<size;i++)
		for(int k=i+1;k<size;k++)
			if((long long)number[i]*number[k]>result)
				result=number[i]*number[k];
	return result;
}
int main(){
/*int n;
cin>>n;
vector <int> number(n);
for(int i=0;i<n;i++)
	cin>>number[i];*/
long long result=maxPairewise(vector<int>(10000,0));
cout<<result<<"\n";
system("pause");
return 0;
}