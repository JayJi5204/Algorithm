class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        if(3<n){
            for(int i=4;i<=n;i++){
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        answer++;
                        break;
                    }
                }
            }
        }
        
        
        
         
        return answer;
    }
}