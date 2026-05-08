class Solution {
    public int solution(int price) {
        double answer = price;
        
        
        if(500000<=price){
            answer-=price*0.2;
        }
        
        else if(300000<=price){
            answer-=price*0.1;
        }
        
        else if(100000<=price){
            answer-=price*0.05;
        }
        
        return (int)answer;
    }
}