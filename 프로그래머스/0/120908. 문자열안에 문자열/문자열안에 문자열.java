class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        char[] arr1=str1.toCharArray();
        
        boolean check=false;
        
        for(int i=0;i<arr1.length-str2.length()+1;i++){
            String str="";
            for(int j=i;j<str2.length()+i;j++){
                str+=arr1[j];
                if(str.equals(str2)){
                    check=true;
                }
            }
        }
        
        if(check){
            answer=1;
        }
        
        
        return answer;
    }
}