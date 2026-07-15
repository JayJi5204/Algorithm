class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] charArr=myString.toCharArray();
        
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]-'0'<60){
                answer+="l";
            }else{
                answer+=charArr[i];
            }
        }
        
        return answer;
    }
}