#include <bits/stdc++.h>

using namespace std;

int main(int argc, char const *argv[])
{
	int n;
	string track;
	cin>>n;
	getline(cin>>ws,track);
	
	//Need to count how many valleys are there....
	int sealevel = 0;
	int s_v,valleys=0;
	for(int i=0;i<track.length();i++)
	{
		if(track[i] == 'U') {sealevel += 1;}
		else				{sealevel -= 1;}

		if(sealevel == -1 and track[i] == 'D')
		{
			s_v = i;
		}

		if(sealevel == 0 and track[i] == 'U' and i > s_v)
		{
			valleys++;
		}
	}
	cout<<valleys<<endl;
	return 0;
}