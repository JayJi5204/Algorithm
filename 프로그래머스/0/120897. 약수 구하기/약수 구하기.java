import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int count=1;
        
        while(true){
            if(n<count){
                break;
            }
            
            if(n%count==0){
                list.add(count);
            }
            
            count++;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);    
        }
        
        return answer;
    }
}