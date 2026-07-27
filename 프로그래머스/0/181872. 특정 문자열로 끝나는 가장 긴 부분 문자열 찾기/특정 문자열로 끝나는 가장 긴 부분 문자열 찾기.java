class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int count=0;
        
        char[] charArr=myString.toCharArray();
        
        for(int i=0;i<=charArr.length-pat.length();i++){
            String str="";
            for(int j=0+i;j<pat.length()+i;j++){
                str+=charArr[j];
            }
            // System.out.println(str);
            if(pat.equals(str)){
                count=i;
            }
        }
        
        count+=pat.length()-1;
        // System.out.println(count);
        
        for(int i=0;i<=count;i++){
            answer+=charArr[i];
        }
        return answer;
    }
}