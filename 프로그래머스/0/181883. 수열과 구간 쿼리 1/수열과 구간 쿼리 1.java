import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        
        for(int i=0;i<queries.length;i++){
            int num1 = queries[i][0];
            int num2 = queries[i][1];
            
            for(int j=num1;j<=num2;j++){
                list.set(j,list.get(j)+1);
            }
            
        }
        

        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}