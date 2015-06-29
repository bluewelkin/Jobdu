
#include <stdio.h>
const int maxn = 502;
const int mod = 1000000007;
int n,i,j;

int main(){
	while(scanf("%d",&n) != EOF){
		if(n & 1 == 1 || n==0){
			printf("0\n");
			continue;
		}
		int dp[maxn][maxn] = {0};

		for(j = 0; j <= n/2; j++){
			dp[0][j] = 1;
		}
		for(i = 1; i <= n/2; i++){
			for(j = i; j <= n/2; j++){
				dp[i][j] = (dp[i-1][j]+dp[i][j-1]) % mod;
			}
		}
		printf("%d\n",dp[n/2][n/2]);
	}
	return 0;
}

/**************************************************************
	Problem: 1547
	User: wangzhenqing
	Language: C++
	Result: Accepted
	Time:50 ms
	Memory:1936 kb
****************************************************************/


                        