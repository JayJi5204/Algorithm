class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        boolean[] check=new boolean[100];
        
        char[] charArr=my_string.toCharArray();
        
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]==' '){
                if(!check[0]){
                    check[0]=true;
                    answer+=charArr[i];
                }
            }else{
                int num=charArr[i]-'0';
                if(!check[num]){
                    check[num]=true;
                    answer+=charArr[i];
                }
            }
        }
        
        
        
        return answer;
    }
}