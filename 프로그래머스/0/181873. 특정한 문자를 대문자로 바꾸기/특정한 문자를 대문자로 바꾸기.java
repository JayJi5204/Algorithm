class Solution {
    public String solution(String my_string, String alp) {
        
        char[] arr=my_string.toCharArray();
        
        char charValue=alp.charAt(0);
        
        String answer = "";
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==charValue){
                char value=Character.toUpperCase(arr[i]);
                answer+=value;
            }else{
                answer+=arr[i];
            }
        }
        
        
        return answer;
    }
}