#include<stdio.h>
long long int fastread()
{long long int t=0;
char ch=getchar_unlocked();
while(ch<33)
ch=getchar_unlocked();
while(ch>33)
{t=t*10+ch-'0';
ch=getchar_unlocked();
}
return t;
}
int main()
{
long long int i,j,k,t,n,m;
t=fastread();
while(t--)
{
n=fastread();
k=fastread();
for(i=0,m=0;i<k;i++)
{
j=fastread();
if(j>m)
m=j;
}
for(i=1,j=1;i<=n;i++)
j=((j%m)*(i%m))%m;
printf("%d\n",j);
}
return 0;
}
 
