#include<stdio.h>
 
inline int getn(){
int n=0,c=getchar_unlocked();
while(c< '0'||c>'9')c= getchar_unlocked();
while(c>='0'&& c<='9')
n = (n<<3)+(n<<1)+c-'0',c= getchar_unlocked();
return n;
}
 
int main()
{
	long long int t,n,k,a[100005],i,j,max;
	//scanf("%lld",&t);
	t=getn();
	
	while(t--)
	{
		//scanf("%lld %lld",&n,&k);
		n=getn();
		k=getn();
		max=-1;
		for(i=0;i<k;i++)
		{
			//scanf("%lld",&a[i]);
			a[i]=getn();
			if(a[i]>max)
				max=a[i];			
		}
		j=1;
		for(i=2;i<=n;i++)
		{
			j=(j*i)%max;
		}
		printf("%lld\n",j);
	
	}
 
return 0;
} 
