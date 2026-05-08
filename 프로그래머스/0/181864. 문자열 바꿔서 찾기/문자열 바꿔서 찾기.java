class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        char[] arr=myString.toCharArray();
        
        char[] patArr=pat.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A'){
                arr[i]='B';
            }else{
                arr[i]='A';
            }
        }
        
        int length=arr.length-pat.length()+1;
        
        for(int i=0;i<length;i++){
            for(int j=0;j<pat.length();j++){
                if(arr[i+j]==patArr[j]){
                    answer=1;
                }
            }
        }
        
        
        return answer;
    }
}