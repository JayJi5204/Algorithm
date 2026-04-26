import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        Long pValue=Long.parseLong(p);
        
        int length=p.length(); 
        
        char[] tChar=t.toCharArray();
        
        ArrayList<String> list=new ArrayList<>();
        
        for(int i=0;i<t.length()-length+1;i++){
            String str="";
            for(int j=i;j<length+i;j++){
                str+=tChar[j];
            }
            list.add(str);
        }
        
        for(int i=0;i<list.size();i++){
            Long listValue=Long.parseLong(list.get(i));
            if(listValue<=pValue){
                answer++;
            }
        }
        
        return answer;
    }
}