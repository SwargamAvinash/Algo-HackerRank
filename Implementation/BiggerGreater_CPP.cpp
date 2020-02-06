#include <bits/stdc++.h>

using namespace std;


// There is a Handy function in cpp that is next_permutation .. that will give you the answer..
// The Code for the Logic You just wrote it in the Java.
int main(){
	int i;
	cin>>i;

	while (i>0)
	{	
		string str;
		getline(cin,str);
		getline(cin,str);

		bool value = next_permutation(str.begin(),str.end());

		if(value == false){
			cout<<"no answer"<<endl;
		}else{
			cout<<str<<endl;
		}
		i--;
	}

	return 0;
}
