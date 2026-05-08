class Solution {
    public String solution(String n_str) {
        
        
        char[] arr=n_str.toCharArray();
        
        int value=arr[0]-'0';
        
        
        String answer = "";
        
        int count=0;
        
        if(value==0){
            for(int i=1;i<arr.length;i++){
                int val=arr[i]-'0';
                if(val!=0){
                    count=i;
                    break;
                }
            }
        }
        
        System.out.println(count);
        
        for(int i=count;i<arr.length;i++){
            answer+=arr[i];
        }
        
        return answer;
    }
}