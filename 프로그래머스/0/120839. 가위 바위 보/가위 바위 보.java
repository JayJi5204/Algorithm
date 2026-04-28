class Solution {
    public String solution(String rsp) {
        
        char[] arr=rsp.toCharArray();
        
        String answer = "";
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]=='2'){
                answer+=0;
            }
            if(arr[i]=='0'){
                answer+=5;
            }
            if(arr[i]=='5'){
                answer+=2;
            }
            
        
        }
        return answer;
    }
}