class Solution {
    public int solution(int n) {
        
        int answer = 2;
        
        int count=1;
        
        while(true){
            if(count*count==n){
                answer=1;
                break;
            }
            
            if(n<count*count){
                break;
            }
            count++;
        }
        
        
        
       
        return answer;
    }
}