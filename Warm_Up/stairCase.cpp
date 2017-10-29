#include <bits/stdc++.h>
using namespace std;


int main(){
    int n;
    cin >> n;
    //Need to print the stair casee..
    
    for(int i=0;i<n;i++)
    {
        int spaces = n-1-i;
        int ashes  = i+1;
        for(int j=0;j<spaces;j++)
        {cout<<" ";}
        for(int j=0;j<ashes;j++)
        {cout<<"#";}
        cout<<endl;
    }
    
    
    return 0;
}
