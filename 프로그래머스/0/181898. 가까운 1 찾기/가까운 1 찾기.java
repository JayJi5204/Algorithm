class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        
        for(int i=idx;i<arr.length;i++){
            if(arr[i]==1){
                answer=i;
                break;
            }
            System.out.println("arr["+i+"] = "+arr[i]);
            System.out.println("i = "+i);
        }
        
        return answer;
    }
}