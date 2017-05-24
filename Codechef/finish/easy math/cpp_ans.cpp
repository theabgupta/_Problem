#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    char tc;
    scanf("%d",&tc);
    int i;
    while(tc--)
    {
        int n,k;
        long long int number,m=0;
        scanf("%d %d",&n,&k);
        for(i=0; i<k; i++)
        {
            scanf("%lld",&number);
            if(number>m)
            {
                m=number;
            }
        }
        long long int res=1;
        if(m<n)
        {
            res=0;
        }
        else
        {
            for(i=1; i<=n; i++)
            {
                res=(res*(i%m))%m;
            }
        }
        printf("%lld\n",res);
    }
    return 0;
}
