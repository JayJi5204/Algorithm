class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a=i;a<=j;a++){
            String str=String.valueOf(a);
            char[] charArr=str.toCharArray();
            
            for(int b=0;b<charArr.length;b++){
                int num=charArr[b]-'0';
                if(num==k){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}