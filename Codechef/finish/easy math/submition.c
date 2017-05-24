#include <stdio.h>
int main(void) {
   int t,n;
   long int k;
	scanf("%d",&t);
	while(t--){
	  scanf("%d %ld",&n,&k);
	  long long int a[100000];
	  long long int i,temp1=0,temp2=1,temp3=0;
	    for(i=0;i<k;i++){
	        scanf("%lld",&a[i]);
	        if(temp1<a[i])
               temp1=a[i];	        
	    }
	    for(i=1;i<=n;i++){
	        temp2=temp2*i;
	    } 
	    temp3=(temp2%temp1);
	    printf("%lld",temp3);
	}
	
	return 0;
} 
