class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int i=0;i<3;i++){
            int value=box[i]/n;
            answer*=value;
            System.out.println(value);
        }
        
        return answer;
    }
}