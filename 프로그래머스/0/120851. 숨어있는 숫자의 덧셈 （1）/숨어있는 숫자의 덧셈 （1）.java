class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] arr=my_string.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            
            int value=arr[i]-'0';
            
            if(9<value){
                continue;
            }else{
                answer+=arr[i]-'0';
            }
        }
        
        return answer;
    }
}