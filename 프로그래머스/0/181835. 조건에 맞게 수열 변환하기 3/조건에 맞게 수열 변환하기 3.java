import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        if(k%2==0){
            for(int i=0;i<arr.length;i++){
                 list.add(arr[i]+k);
            }     
        }else{
           for(int i=0;i<arr.length;i++){
                 list.add(arr[i]*k);
            }  
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}