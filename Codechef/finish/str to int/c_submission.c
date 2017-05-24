#include<stdio.h>
#include<string.h>
int main(void){
	int k,t,i,j,count=0;
    char set[11]={'0','1','2','3','4','5','6','7','8','9','\0'};
    char str[10001];
	scanf("%d",&t);
  //	fflush(stdin);
	for(k=0;k<t;k++){
		gets(str);
	    for(i=0;i<strlen(str);i++){
		   for(j=0;j<11;j++){
	          if(set[j]==str[i]){
    			 count++;
				 int l;
				 for(l=i;l<strlen(str);l++){
				 	str[l]=str[l+1];
				 }
				 j=0;
				 i--;
		      }   
		   }	
	    }
	    printf("%s\n",str);
    }
    return 0;
}  
