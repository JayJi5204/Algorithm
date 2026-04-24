import java.util.*;

class Solution {
	public String solution(String s) {
        
        char[] arr=s.toCharArray();

        String answer = "";
        
        for(int i=0;i<arr.length;i++){
            if(i==0&&9<arr[i]){
               answer+=Character.toUpperCase(arr[i]);
            }else if(0<i&&arr[i-1]==' '&&9<arr[i]){
                answer+=Character.toUpperCase(arr[i]);
            }else{
                answer+=Character.toLowerCase(arr[i]);
            }
        
        }
        
		

		return answer;
	}
}