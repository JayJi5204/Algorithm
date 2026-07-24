class Solution {
    public int[] solution(int[] arr) {
        
        int count=0;
        
        int start=1;
        
        int length=arr.length;
        
        while(true){
            
            if(length<=start){
                break;
            }
            
            start*=2;
            count++;
            System.out.println(start);
        }
        
        int[] answer = new int[(int)Math.pow(2,count)];
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}