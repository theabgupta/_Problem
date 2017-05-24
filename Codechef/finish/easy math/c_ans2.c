#include<stdio.h>
 
 
int get()
{ 
int t=0;
char ch=getchar();
while(ch<'0'||ch>'9')
   ch=getchar();
while(ch>='0'&&ch<='9')
   t=(t<<3)+(t<<1)+ch-'0',ch=getchar();
return t;    
}
 
 
int main()
{
 int t,n,k,max,i,a;
 long long f;
 t=get();
 while(t--)
 {
   n=get();
   k=get();
   max=0;
   for(i=0;i<k;i++)
   {    a=get();
       if(a>max)
         max=a;          
   }     
        
   f=1;       
    
  for(i=1;i<=n;i++)
  {
    f=(f*i)%max;
  }
  
  printf("%lld\n",f);
 
 }    
}