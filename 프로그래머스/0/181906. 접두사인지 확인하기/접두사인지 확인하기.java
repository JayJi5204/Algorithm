class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str="";
        
        char[] charArr=my_string.toCharArray();
        
        for(int i=0;i<charArr.length;i++){
            str+=charArr[i];
            if(str.equals(is_prefix)){
                answer=1;
                break;
            }
        }
        
        return answer;
    }
}