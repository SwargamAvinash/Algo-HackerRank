#include <bits/stdc++.h>

using namespace std;

// How many swaps are required to make the array sorted...
void minSwapsRequired(vector<int> arr,int n){
	map<int,int> arrayWithIndex;
	for (int i=0;i<n;i++){
		arrayWithIndex.insert({arr[i],i});
	}
}

int main(){
	int n;
	cin>>n;
	vector<int> a(n);
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	minSwapsRequired(a,n);
	return 0;
}
