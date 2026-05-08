class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] arr=myString.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='A'){
                answer+='A';
            }else{
                char value=Character.toLowerCase(arr[i]);
                answer+=value;
            }
        }
        
        return answer;
    }
}