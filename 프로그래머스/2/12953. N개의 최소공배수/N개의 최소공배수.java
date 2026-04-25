import java.util.*;

class Solution {
    public int solution(int[] arr) {
        
        Arrays.sort(arr);
        
        int start=arr[arr.length-1]+1;

        
        int answer = 0;
        
        boolean check=true;
        
        boolean answerCheck=false;
        
        while(check){
        
        for(int i=0;i<arr.length;i++){
            if(start%arr[i]!=0){
                check=true;
                break;
            }else{
                check=false;
                answer=start;
            }
        }
            start++;
            
            
        }
        
       
        return answer;
    }
}