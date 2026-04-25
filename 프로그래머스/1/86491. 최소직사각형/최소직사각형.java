class Solution {
    public int solution(int[][] sizes) {
     
        
        int width=0;
        int height=0;
        
        
        for(int i=0;i<sizes.length;i++){
            int w=0;
            int h=0;
            
            if(sizes[i][0]>sizes[i][1]){
                w=sizes[i][0];
                h=sizes[i][1];
            }else{
                w=sizes[i][1];
                h=sizes[i][0];
            }
            
            width=Math.max(width,w);
            height=Math.max(height,h);
               
        }
        
           int answer = width*height;
        
        return answer;
    }
}