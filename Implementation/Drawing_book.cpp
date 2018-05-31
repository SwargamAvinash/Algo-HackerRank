#include <bits/stdc++.h>

using namespace std;

int main(int argc, char const *argv[])
{
	int n,p;
	cin>>n>>p;

	//minimum number of pages that need to be turned...
	if(p < n/2)
	{
		cout<<p/2<<endl;
	}
	else
	{
		cout<<(n/2-p/2)<<endl;
	}
	return 0;
}