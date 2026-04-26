class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] arr= my_string.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            int value=arr[i]-'0';
            if(value<49){
                answer+=Character.toLowerCase(arr[i]);
            }else{
                answer+=Character.toUpperCase(arr[i]);
            }
            System.out.println(value);
        }
        
        return answer;
    }
}