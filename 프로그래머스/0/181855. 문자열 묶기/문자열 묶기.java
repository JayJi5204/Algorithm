class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int[] arr=new int[100000];
        
        for(int i=0;i<strArr.length;i++){
            int num=strArr[i].toCharArray().length;
            arr[num]++;
            answer=Math.max(answer,arr[num]);
            
        }
        
        return answer;
    }
}