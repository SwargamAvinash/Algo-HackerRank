//Could have just used five variables and counted the variables.... would have been O(n) complexity and O(n) space....
//Now the complexity is O(nlogn)
#include<bits/stdc++.h>

using namespace std;

#define F first 
#define S second 

int migratory_birds(vector<int> v) 
{
	map<int,int> track;

	for(int i=0;i<v.size();i++)
	{
		if(track.find(v[i]) == track.end())
		{
			track.insert({v[i],1});
		}
		else
		{
			map<int,int>::iterator it;
			it = track.find(v[i]);
			it->S++;
		}
	}
	map<int,int>::iterator it;

	int max = INT_MIN,type;
	for(it=track.begin();it!=track.end();it++)
	{
		if(max < it->S){max = it->S;type = it->F;}
		else if(max == it->S and type > it->F) {type = it->F;}
	}

	return type;
}

int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	vector<int> ids(n);

	for(int i=0;i<n;i++)
	{
		cin>>ids[i];
	}

	int ans = migratory_birds(ids);
	printf("%d\n",ans);
	return 0;
}