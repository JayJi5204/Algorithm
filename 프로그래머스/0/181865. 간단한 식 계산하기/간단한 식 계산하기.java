class Solution {
    public int solution(String binomial) {
        int answer=0;
        
        char[] arr=binomial.toCharArray();
        
        char charValue=' ';
        
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            char value=arr[i];
            if(value=='+'||value=='-'||value=='*'){
                charValue=value;
                count =i;
                break;
            }
        }
        
        int value1=0;
        int value2=0;
        
        String str="";
        
        for(int i=0;i<count-1;i++){
            str+=arr[i];
        }
        
        value1=Integer.parseInt(str);
        
        System.out.println(value1);
        
        str="";
        
        for(int i=count+2;i<arr.length;i++){
            str+=arr[i];
        }
        
        value2=Integer.parseInt(str);
        
        System.out.println(value2);
        
        if(charValue=='+'){
            answer=value1+value2;
        }
        if(charValue=='-'){
            answer=value1-value2;
        }if(charValue=='*'){
            answer=value1*value2;
        }
        

        return answer;
    }
}