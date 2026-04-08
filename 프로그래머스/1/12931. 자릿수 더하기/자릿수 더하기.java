import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true){
            answer += n%10;
            n/=10;
            if(n<10) break;
        }
        answer += n;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}