import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        char[] arr=myString.toCharArray();
        
        ArrayList<Integer> list=new ArrayList<>();
        
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='x'){
                list.add(count);
                count=0;
            }else{
                count++;
            }
        }
        
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}