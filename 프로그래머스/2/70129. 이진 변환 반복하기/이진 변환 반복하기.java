class Solution {
    public int[] solution(String s) {
        
        int count=0;
        
        String str=s;
        
        int number=0;
        
        while(true){
            if(str.length()==1){
                break;
            }
            number++;
            
            char[] arr=str.toCharArray();
            
            str="";
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='0'){
                    count++;
                }else{
                    str+=arr[i];
                }
            }
            int length=str.length();
            
            str=Integer.toBinaryString(length);
           
        
        }
        
        int[] answer = {number,count};
        return answer;
    }
}