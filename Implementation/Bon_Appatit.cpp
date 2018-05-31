#include <bits/stdc++.h>

using namespace std;

int main(int argc, char const *argv[])
{
	int n,k;
	scanf("%d %d",&n,&k);

	vector<int> bill(n);
	for(int i=0;i<n;i++)
	{
		cin>>bill[i];
	}
	int b;
	cin>>b;
	int sum = 0;
	for(int i=0;i<n;i++)
	{
		if(i != k)
		{
			sum+=bill[i];
		}
	}
	sum = sum/2;
	if(sum == b)
	{
		printf("Bon Appetit\n");
	}
	else
	{
		printf("%d\n",(b-sum));
	}

	return 0;
}