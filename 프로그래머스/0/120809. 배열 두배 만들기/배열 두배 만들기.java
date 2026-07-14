import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]*2);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}