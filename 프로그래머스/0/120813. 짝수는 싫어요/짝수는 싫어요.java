import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        int count=1;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        while(true){
            
            if(n<count){
                break;
            }
            if(count%2!=0){
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