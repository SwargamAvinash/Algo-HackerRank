#include <bits/stdc++.h>

using namespace std;

//In the above code we need to handle all the cases.. in which...they cannot meet....

string kangaroo(int x1, int v1, int x2, int v2) {
    // Complete this function
    //The kangaroo at which is before should have greater velocity and front one should have lesser
    if(x1>x2)
    {
        if(v2<=v1)
        {return "NO";}
    }
    else if(x2 > x1)
    {
        if(v1<=v2)
        {return "NO";}
    }
        
    if(abs(x1-x2) < abs(v1-v2))
    {return "NO";}
    
    if(abs(x1-x2)%abs(v1-v2) !=0)
    {return "NO";}
    
    return "YES";
}

int main() {
    int x1;
    int v1;
    int x2;
    int v2;
    cin >> x1 >> v1 >> x2 >> v2;
    string result = kangaroo(x1, v1, x2, v2);
    cout << result << endl;
    return 0;
}
