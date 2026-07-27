class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        char[] charArr=myString.toCharArray();
        
        for(int i=0;i<=charArr.length-pat.length();i++){
            String str="";
            for(int j=i;j<pat.length()+i;j++){
                str+=charArr[j];
            }
            if(pat.equals(str)){
                answer++;
            }
        }
        
        
        return answer;
    }
}