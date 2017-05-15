#include<string.h>
#include<stdio.h>
#include<stdlib.h>
 
int main()
{
int t,i;
char ch[10];
scanf("%d",&t);
gets(ch);
while(t--)
{
	char str[10006];
	gets(str);
	int temp=strlen(str);
	int m=0;
	for(i=0;i<temp;i++)
	{
		if(str[i]-48>=0 && str[i]-48<=9)
			continue;
		else
		{
			printf("%c",str[i]);
		}
	}
	printf("\n");
}
return 0;
}
