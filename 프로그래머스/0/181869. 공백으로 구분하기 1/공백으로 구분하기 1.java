import java.util.*;

class Solution {
    public String[] solution(String my_string) {

        ArrayList<String> list=new ArrayList<>();

        char[] arr=my_string.toCharArray();
        
        String str="";
        
        for(int i=0;i<arr.length;i++){
        
            if(arr[i]==' '){
                if(0<str.length()){
                    list.add(str);
                    str="";
                }
                    
            }else{
                str+=arr[i];
            }
            
        }
        
        if(0<str.length()){
            list.add(str);
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);    
        }
        
        return answer;
    }
}