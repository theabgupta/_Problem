#include<stdio.h>
typedef long long  biginput;
 
#define gc getchar_unlocked
 
inline biginput fastinput()
{
 
	char c;
	biginput ans=0;
	do{
		c=gc();
	}while(c<'0' || c>'9');
	do{
		ans = (ans<<3) + (ans<<1) + (c-48);
		c=gc();
	}while(c>='0' && c<='9');
	return ans;
 
}
void fact(biginput n,biginput max)
{
    biginput f=1;
    if(n!=0)
    {
     while(n>=1&&f)
     {
        
        f*=n;
        f%=max;
        n--;
     }
     printf("%lld\n",f);
    }
    else
        printf("0\n");
 
}
 
int main()
{
    biginput t,k,n,max,Ak;
 
 
 
    t=fastinput();
    while(t--)
    {
        max=0;
        n=fastinput();
        k=fastinput();
        while(k--)
        {
            Ak=fastinput();
 
            if(Ak>max)
                max=Ak;
 
        }
        n%=max;
        fact(n,max);
 
 
    }
 
 
   return 0;
 
}
