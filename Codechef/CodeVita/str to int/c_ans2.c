#include <stdio.h>
 
 
 
int main()
{
  
  int t;
  char c;
  scanf("%d\n",&t);
  while(t--)
  {
  c=getchar();
    while(c!='\n' && c!=EOF)
    {
      if(c<'0' || c>'9')
        putchar(c);
      c=getchar();
    }
    putchar('\n');
  }
  
} 
