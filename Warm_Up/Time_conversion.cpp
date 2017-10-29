#include <bits/stdc++.h>

using namespace std;

string timeConversion(string s) {
    // Complete this function
    //In the single string I have the data and time..
    string dummy;
    int flag;
    if(s[s.length()-2] == 'P'){flag = 1;}
    else flag = 0;
    
    dummy = s[0];
    dummy += s[1];
        
    if(flag == 1)
    {
        if(dummy!="12")
        {
            if(dummy == "08"){s[0] = '2';s[1] = '0';}
            else if(dummy == "09"){s[0] = '2';s[1] = '1';}
            else if(dummy == "10"){s[0] = '2';s[1] = '2';}
            else if(dummy == "11"){s[0] = '2';s[1] = '3';}
            else{s[0] += 1;s[1] += 2;}       
            
        }
    }
    else
    {
        if(dummy == "12")
        {
            s[0] = '0';
            s[1] = '0';
        }
    }
    s[s.length()-2] = ' ';
    s[s.length()-1] = ' ';
    return s;
}

int main() {
    string s;
    cin >> s;
    string result = timeConversion(s);
    cout << result << endl;
    return 0;
}
