class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            int number=0;
            for(int j=i;j<=n;j++){
                number+=j;
                if(n<number){
                    break;
                }
                
                if(number==n){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}