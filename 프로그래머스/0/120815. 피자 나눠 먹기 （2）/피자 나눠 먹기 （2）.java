class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num=n;

        while(true){
            if(n%6==0){
                answer=n/6;
                break;
            }
            
            n=n+num;
            
        }
        
        return answer;
    }
}