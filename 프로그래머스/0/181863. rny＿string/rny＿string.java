import java.util.*;

class Solution {
    public String solution(String rny_string) {
        
        char[] arr=rny_string.toCharArray();
        
         String answer = "";
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='m'){
                answer+="rn";
            }else{
                answer+=arr[i];
            }
        }
        
        
       
        return answer;
    }
}