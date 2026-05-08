import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            for(int j=0;j<value;j++){
                list.add(value);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}