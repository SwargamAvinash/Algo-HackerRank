#include <bits/stdc++.h>

using namespace std;

#define F first
#define S second

int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	vector<int> socks(n);
	for(int i=0;i<n;i++)
	{
		cin>>socks[i];
	}

	map<int,int> count;

	for(int i=0;i<n;i++)
	{
		if(count.find(socks[i]) == count.end())
		{
			count.insert({socks[i],1});
		}
		else
		{
			map<int,int> :: iterator it = count.find(socks[i]);
			it->S++;
		}
	}
	map<int,int>::iterator it;
	int ans=0;
	for(it=count.begin();it!=count.end();it++)
	{
		ans += (it->S)/2;
	}

	cout<<ans<<endl;
	return 0;
}