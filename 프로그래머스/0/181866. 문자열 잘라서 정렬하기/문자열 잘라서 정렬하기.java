import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        ArrayList<String> list=new ArrayList<>();
        
        char[] charArr=myString.toCharArray();
        
        String str="";
        
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]=='x'){
                if (!str.equals("")) {
                    list.add(str);
                }
                str="";
            }else{
                str+=charArr[i];
                if(i==charArr.length-1){
                    list.add(str);
                }
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}