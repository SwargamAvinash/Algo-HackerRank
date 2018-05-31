#include <bits/stdc++.h>

using namespace std;

void print_vector(std::vector<int> v)
{
	for(int i=0;i<v.size();i++)
	{
		cout<<v[i]<<" ";
	}
	cout<<endl;
}

int find_max(vector<int> key,vector<int> usb,int b)
{
	if(b < (key[0] + usb[0])){return -1;} 

	int i = key.size()-1 , j = 0;

	int max = INT_MIN;
	while(i>=0 and j<usb.size())
	{
		int spending = key[i] + usb[j];
		if(spending > max and spending <= b){max = spending;}
		
		if(spending > b) {i--;}
		else if(spending < b) {j++;}
		else {break;} 
	}
	return max;
}

int main(int argc, char const *argv[])
{
	vector<int> key,usb;
	int b,m,n;

	cin>>b>>m>>n;
	for(int i=0;i<m;i++)
	{
		int k;
		cin>>k;
		key.push_back(k);
	}

	for(int i=0;i<n;i++)
	{
		int k;
		cin>>k;
		usb.push_back(k);
	}

	sort(key.begin(),key.end());
	sort(usb.begin(),usb.end());	

	// print_vector(key);
	// print_vector(usb);

	int max_spending = find_max(key,usb,b);	

	cout<<max_spending<<endl;
	return 0;
}