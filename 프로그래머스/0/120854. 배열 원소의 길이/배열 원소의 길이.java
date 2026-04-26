class Solution {
    public int[] solution(String[] strlist) {
        
       int[] answer = new int[strlist.length];
        
        char[] arr;
        
        for(int i=0;i<strlist.length;i++){
            arr=strlist[i].toCharArray();
            answer[i]=arr.length;
            
        }
        
        
       
        return answer;
    }
}