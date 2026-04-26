class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] arr=my_string.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            int value=arr[i]-'0';
            
            if(value==49||value==53||value==57||value==63||value==69){
            continue;
            }
            answer+=arr[i];
        }
        
        return answer;
    }
}