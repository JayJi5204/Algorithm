import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        ArrayList<String> list=new ArrayList<>();
        
        for(int i=0;i<strArr.length;i++){
            if(i%2==0){
                list.add(strArr[i].toLowerCase());
            }else{
                list.add(strArr[i].toUpperCase());
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}