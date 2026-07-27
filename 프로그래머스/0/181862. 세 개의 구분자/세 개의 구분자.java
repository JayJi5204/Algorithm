import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        ArrayList<String> list=new ArrayList<>();
        
        char[] charArr=myStr.toCharArray();
        String str="";
        
        for(int i=0;i<charArr.length;i++){
          
            if(51<charArr[i]-'0'){
                str+=charArr[i];
                
            }else{
                if(str.equals("")){
                    continue;
                }else{
                     list.add(str);
                // System.out.println(str);
                str="";
                }
               
            }
        }
        
        if(str.length()!=0){
            list.add(str);
        }
        
        // System.out.println(list.size());
         
        String[] answer;
        
        if(list.size()==0){
        answer=new String[1];
           answer[0]="EMPTY";
         }else{
            answer = new String[list.size()];
             for(int i=0;i<list.size();i++){
               answer[i]=list.get(i);
          }
           
       }
        
        return answer;
    }
}