class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] charArr=my_string.toCharArray();
        
        for(int i=0;i<s;i++){
            answer+=charArr[i];
        }
        
        for(int i=e;i>=s;i--){
            answer+=charArr[i];
        }
        
        if(e<charArr.length){
            for(int i=e+1;i<charArr.length;i++){
                answer+=charArr[i];
            }
        }

        
        return answer;
    }
}