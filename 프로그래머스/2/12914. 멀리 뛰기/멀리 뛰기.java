class Solution {
    public long solution(int n) {
        
        int[] dp=new int[n+1];
        
           
        dp[1]=1;
        if(1<n){
        dp[2]=2;
        }
        if(2<n){
        for(int i=3;i<n+1;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1234567;
        }
        }
        long answer = dp[n];
        return answer;
    }
}