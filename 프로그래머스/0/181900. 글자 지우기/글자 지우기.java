class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        char[] charArr=my_string.toCharArray();
        
        boolean[] bool=new boolean[charArr.length];
        
        for(int i=0;i<indices.length;i++){
            int num=indices[i];
            bool[num]=true;
        }
        
        for(int i=0;i<charArr.length;i++){
            if(!bool[i]){
                answer+=charArr[i];
            }
        }
        
        
        return answer;
    }
}