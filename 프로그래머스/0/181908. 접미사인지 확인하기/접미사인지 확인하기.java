import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
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
        
        int answer = 0;
        
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(is_suffix)){
                answer=1;
            }
        }
        
     
        return answer;
    }
}