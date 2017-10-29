#include <bits/stdc++.h>

using namespace std;

int main() {
    vector<int> arr(5);
    for(int arr_i = 0; arr_i < 5; arr_i++){
       cin >> arr[arr_i];
    }
    //we already have the array..
    sort(arr.begin(),arr.end());
    
    //add the first four for the minimum and add the last four for the maximum..
    long sum = 0;
    for(int i=0;i<5;i++){sum+=arr[i];}
    
    //for minimum...
    cout<<(sum-arr[4])<<" "<<(sum-arr[0])<<endl;
    
    return 0;
}
