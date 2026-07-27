class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] charArr=my_string.toCharArray();
        
        String str="";
        
        for(int i=0;i<charArr.length;i++){
            
            if(charArr[i]-'0'<10){
                str+=charArr[i];
            }else{
                if(str.equals("")){
                    continue;
                }else{
                    int num=Integer.parseInt(str);
                    answer+=num;
                    str="";
                }
            }
            // System.out.println(str);
            
        }
        
        if(str.length()!=0){
            answer+=Integer.parseInt(str);
        }
        
        return answer;
    }
}