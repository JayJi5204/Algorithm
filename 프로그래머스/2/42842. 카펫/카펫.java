class Solution {
    public int[] solution(int brown, int yellow) {
        
        int sum=brown+yellow;
        
        int w=0;
        int h=1;
        
         int[] answer = new int[2];
        
        for(int i=1;i<=sum;i++){
            if(sum%i==0){
                w=sum/i;
                h=i;
                System.out.println("w: "+w);
                System.out.println("h: "+h);
                System.out.println("-------------");
                if(h<=w&&2*(w+h)-4==brown){
                    answer[0]=w;
                    answer[1]=h;
                    break;
                    
                }
            }
           
        }
         System.out.println(h);
         System.out.println(w);
        
       
        return answer;
    }
}