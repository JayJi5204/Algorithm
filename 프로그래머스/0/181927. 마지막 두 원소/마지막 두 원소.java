import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<num_list.length;i++){
            list.add(num_list[i]);
        }
        
        int last=num_list.length-1;
        
        if(num_list[last-1]<num_list[last]){
            list.add(num_list[last]-num_list[last-1]);
        }else{
            list.add(num_list[last]*2);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}