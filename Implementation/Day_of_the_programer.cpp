#include<bits/stdc++.h>

using namespace std;

void print_day(int year)
{

	if(year < 1700 and year > 2700){printf("DoesNot--come in range..\n");}
	else if(year > 1918)
	{
		if((year % 4 == 0 and year % 100 !=0) or (year % 400 == 0))//This means a leap year...
		{
			printf("12.09.%d \n",year);
		}
		else
		{
			printf("13.09.%d \n",year);
		}
	}

	else if(year < 1918)
	{
		if((year % 4 == 0))
		{
			printf("12.09.%d \n",year);
		}
		else
		{
			printf("13.09.%d \n",year);
		}
	}
	else if(year == 1918)
	{
		printf("26.09.%d \n",year);
	}
}

int main(int argc, char const *argv[])
{
	int year;
	scanf("%d",&year); 

	print_day(year);
	return 0;
}