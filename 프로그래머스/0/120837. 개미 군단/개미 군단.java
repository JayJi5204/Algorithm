class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int genaralAnt=5;
        int soldierAnt=3;
        int workAnt=1;
        
        
        while(true){
            
            if(hp==0){
                break;
            }
            
            if(genaralAnt<=hp){
                answer++;
                hp-=genaralAnt;
            }else if(soldierAnt<=hp){
                answer++;
                hp-=soldierAnt;
            }
            else if(workAnt<=hp){
                answer++;
                hp-=workAnt;
            }
            
            
        }
        
        return answer;
    }
}