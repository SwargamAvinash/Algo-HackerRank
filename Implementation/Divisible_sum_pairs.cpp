#include <bits/stdc++.h>

using namespace std;


int Divisible(vector<int> v,int k)
{
	int count = 0;
	for(int i=0;i<v.size();i++)
	{
		for (int j=i+1;j<v.size(); j++)
		{
			if((v[i] + v[j]) % k == 0){count++;}
		}
	}

	return count;
}

int main(int argc, char const *argv[])
{
	int n;
	int k;

	scanf("%d %d",&n,&k);
	vector<int> v(n);

	for(int i=0;i<n;i++)
	{
		cin>>v[i];
	}

	int ans = Divisible(v,k);
	printf("%d\n",ans);
	return 0;
}