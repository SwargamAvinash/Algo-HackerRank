#include <bits/stdc++.h>

using namespace std;

void printAnArray(vector<int> array){
	for(int i=0;i<array.size();i++){
		cout<<array[i];
		cout<<"\t";
	}
	cout<<endl;
}

int getSum(vector<int> bitArray,int index){
	int sum = 0;
	while(index>0){
		sum += bitArray[index];
		index = index - (index & (-index));
	}
	return sum;
}

void updateBitArray(vector<int> &bitArray,vector<int> arr,int index,int value){
	index = index + 1;
	while(index <= bitArray.size()){
		bitArray[index] += value;
		index += (index & (-index));
	}
}

int createBITArray(vector<int> arr){
	int max = INT_MIN,inversionCount = 0;
	for(int i=0;i<arr.size();i++){
		if(max < arr[i]){
			max = arr[i];
		}
	}
	vector<int> bitArray(max+1);
	for (int i = 0; i < bitArray.size(); i++)
	{
		bitArray[i] = 0;
	}
	for (int i = arr.size() - 1; i >=0; i--)
	{
		inversionCount += getSum(bitArray,arr[i]);
		updateBitArray(bitArray,arr,arr[i],1);
	}
	return inversionCount;
}

int main(){
	int t;
	cin>>t;
	while(t--){
		int n,i,k;
		cin>>n;
		vector<int> arr(n);
		for (i = 0; i < n; i++)
		{
			cin>>arr[i];
		}
		printAnArray(arr);
		cout<<createBITArray(arr);
	}    
    return 0;
}
