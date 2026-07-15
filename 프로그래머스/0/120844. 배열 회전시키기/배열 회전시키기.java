import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int last=numbers.length;
        
        if(direction.equals("right")){
             list.add(numbers[last-1]);
            for(int i=0;i<last-1;i++){
                list.add(numbers[i]);
            }
        }else{
            for(int i=1;i<last;i++){
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}