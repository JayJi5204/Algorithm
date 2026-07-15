class Solution {
    public int solution(String number) {
        int answer = 0;
        
        char[] charArr=number.toCharArray();
        
        for(int i=0;i<charArr.length;i++){
            answer+=charArr[i]-'0';
        }
        
        answer=answer%9;
        
        return answer;
    }
}