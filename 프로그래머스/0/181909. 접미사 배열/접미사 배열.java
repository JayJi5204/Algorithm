import java.util.*;


class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> list=new ArrayList<>();
        
        char[] charArr=my_string.toCharArray();
        
        String str="";
        
        for(int i=0;i<charArr.length;i++){
            str="";
            for(int j=i;j<charArr.length;j++){
                str+=charArr[j];
            }    
            list.add(str);
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}