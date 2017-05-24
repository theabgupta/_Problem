#include<iostream>
#include<algorithm>
#include<string>
#include<map>
#include<cmath>
#include<string.h>
#include<stdlib.h>
#include<cstdio>
#define ll long long
using namespace std;
int main(){  
	int t;
    cin>>t;  
    while(t--){  
		ll n,m,a,s=1;
		cin>>n>>m;
		ll max=0;
		for(int i=0;i<m;++i){
			cin>>a;
			if(a>max)
				max=a;}
		for(int i=1;i<=n;++i)
			s=((s%max)*(i%max))%max;
		cout<<s<<endl;}
	return 0;
} 
