import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        char[] arr=s.toCharArray();
        
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                stack.add(arr[i]);
            }else{
                char peek=stack.peek();
                if(peek==arr[i]){
                    stack.pop();
                }else{
                    stack.add(arr[i]);
                }
            }
        }
        
        
        if(stack.isEmpty()){
            answer=1;
        }else{
            answer=0;
        }
      
        
        return answer;
    }
}