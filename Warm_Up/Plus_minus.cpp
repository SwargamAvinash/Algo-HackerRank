#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    
    float posi,negi,zero;
    posi = negi = zero = 0;
    
    for(int i=0;i<n;i++)
    {
        arr[i]>0?posi++:(arr[i]==0?zero++:negi++);//conditional statment for the increaing...
    }
    
    //printing their fractions...
    cout<<posi/n<<endl;
    cout<<negi/n<<endl;
    cout<<zero/n<<endl;
    
    return 0;
}
