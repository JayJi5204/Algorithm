import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        char[] charArr=my_string.toCharArray();
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<charArr.length;i++){
            int value=charArr[i]-'0';
            if(value<10){
                list.add(value);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}