#include<stdio.h>
#include<string.h>
#include<stdlib.h>
 
int main()
{
	int t,i,j,l;
	char s[10005],y[10005];
	
	scanf("%d",&t);
	t++;
	while(t--)
	{
		gets(s);
		j=0;
		for(i=0;s[i]!='\0';i++)
		{
			if(s[i]<48 || s[i]>57)
			{
				y[j]=s[i];
				j++;
			}
		}
		y[j]='\0';
		printf("%s\n",y);
	}
 
return 0;
} 
