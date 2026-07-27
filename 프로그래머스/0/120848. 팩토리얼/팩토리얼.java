class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int total=1;
        
        while(true){
            
            total*=answer;
            
            if(n<total){
                answer--;
                break;
            }
            
            answer++; 
            
        }
        
        return answer;
    }
}