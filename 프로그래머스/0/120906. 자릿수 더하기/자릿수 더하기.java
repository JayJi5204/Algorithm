class Solution {
    public int solution(int n) {
        
        String str=String.valueOf(n);
        
        char[] arr=str.toCharArray();
        
        int answer = 0;
        
        for(int i=0;i<arr.length;i++){
            int value=arr[i]-48;
            answer+=value;
        }
        
        return answer;
    }
}