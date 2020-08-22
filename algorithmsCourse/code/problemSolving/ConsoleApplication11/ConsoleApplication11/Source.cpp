#include<iostream>
#include<cstdlib>
#include<vector>
using std::cin;
using std::cout;
using std::vector;
long long maxPairewiseFast(const vector<int>&number){
	int max_index1=-1;
	int size=number.size();
	for(int i=1;i<size;i++)
		if(max_index1==-1||(number[i]>number[max_index1]))
			{max_index1=i;}
		int max_index2=0;
	for(int k=1;k<size;k++)
		if((k!=max_index1)&&((max_index2==-1)||(number[k]>number[max_index2])))
		{max_index2=k;}
	return (long long)number[max_index1]*number[max_index2];
}

int main(){
	
	int n;
cin>>n;
vector <int> number(n);
for(int i=0;i<n;i++)
	cin>>number[i];
	long long result=maxPairewiseFast(number);
cout<<result<<"\n";
	system("pause");
return 0;
}