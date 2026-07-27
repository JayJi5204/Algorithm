import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        
        for(int i=0;i<queries.length;i++){
            int num1=list.get(queries[i][0]);
            int num2=list.get(queries[i][1]);
            list.set(queries[i][0],num2);
            list.set(queries[i][1],num1);

        }
        
        
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}