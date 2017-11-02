#include <bits/stdc++.h>

using namespace std;


int main(){
    int s;
    int t;
    cin >> s >> t;
    int a;
    int b;
    cin >> a >> b;
    int m;
    int n;
    cin >> m >> n;
    vector<int> apple(m);
    for(int apple_i = 0;apple_i < m;apple_i++){
       cin >> apple[apple_i];
    }
    vector<int> orange(n);
    for(int orange_i = 0;orange_i < n;orange_i++){
       cin >> orange[orange_i];
    }
    int count = 0;
    //Number of apples fall on the sams house 
    for(int i=0;i<apple.size();i++)
    {
        //for each apples distance..      
        int fall = apple[i] + a;
        if(fall >= s and fall <= t)
        {count++;}
    }
    cout<<count<<endl;
    count = 0;
    for(int i=0;i<orange.size();i++)
    {
        int fall = orange[i] + b;
        if(fall >= s and fall <= t)
        {count++;}
    }
    cout<<count<<endl;
    
    return 0;
}
