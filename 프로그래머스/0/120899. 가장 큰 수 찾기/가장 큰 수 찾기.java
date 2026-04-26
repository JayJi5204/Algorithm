class Solution {
    public int[] solution(int[] array) {
      
        
        int number=0;
        int value=0;
        
        for(int i=0;i<array.length;i++){
            if(number<array[i]){
                number=array[i];
                value=i;
            }
        }
        
          int[] answer = {number,value};
        
        return answer;
    }
}