#include <bits/stdc++.h>

using namespace std;

void printArray(vector<int> array){
	for(int a : array){
		cout<<a<<" ";
	}
	cout<<endl;
}

void sortArray(vector<int> &a){ // Using And means passing by reference in cpp
	int count = 0;
	int n  = a.size();
	for (int i=1;i<n;i++){
		int key = a[i];
		int j = i-1;
		bool wentin = true;
		while (a[j]>key and j>=0){
			a[j+1] = a[j];
			j--;
			if (wentin) {
				count++;
				wentin = false;
			}
		}
		a[j+1] = key;
	}
	cout<< "How much sorted the array is :: "<<count<<endl;
}

int main(){
	int n;
	cin>>n;
	vector<int> arr(n);
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	printArray(arr);
	sortArray(arr);
	printArray(arr);
	return 0;
}