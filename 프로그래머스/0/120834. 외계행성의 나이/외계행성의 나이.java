class Solution {
    public String solution(int age) {
        String answer = "";
        char[] charArr={'a','b','c','d','e','f','g','h','i','j'};
        
        String str=String.valueOf(age);
        char[] arr=str.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            
            int num=arr[i]-'0';
            
            answer+=charArr[num];
        }

        return answer;
    }
}