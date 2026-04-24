class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String nowBinaryString=Integer.toBinaryString(n);
        
        int nowCount=0;
        
        char[] arr=nowBinaryString.toCharArray();
        
        for(int i=0;i<nowBinaryString.length();i++){
            if(arr[i]=='1'){
                nowCount++;
            }
        }
        
        int nextValue=n+1;
        
        while(true){
            
            String str=Integer.toBinaryString(nextValue);
            
            char[] charArr=str.toCharArray();
            
            int count=0;
        
        for(int i=0;i<str.length();i++){
            if(charArr[i]=='1'){
                count++;
            }
        }
            
            if(nowCount==count){
                answer=nextValue;
                break;
            }
            nextValue++;
            
        }
        
        
        
        return answer;
    }
}