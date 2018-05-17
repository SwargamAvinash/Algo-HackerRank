#include <bits/stdc++.h>

using namespace std;

int solve(int n, vector < int > s, int d, int m)
{
    // Complete this function
    int sum = 0,i = 0,count = 0;
    for(int j=0;j<s.size();j++)
    {
        if(j==0)
        {
            int k;
            for(k=j;k<m;k++)
            {
                sum += s[k];
            }
            j=k-1;
        }
        else
        {
            printf("%d\n",sum);
            sum = sum - s[i] + s[j];
            i++;
        }
        if(sum == d){count++;}
    }

    return count;
}

int main() 
{
    int n;
    cin >> n;
    vector<int> s(n);
    for(int s_i = 0; s_i < n; s_i++)
    {
    	cin >> s[s_i];
    }
    int d;
    int m;
    cin >> d >> m;
    int result = solve(n, s, d, m);
    cout << result << endl;
    return 0;
}