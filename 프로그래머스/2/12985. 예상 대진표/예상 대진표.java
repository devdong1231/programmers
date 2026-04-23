class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        if(a - b == 1 || a - b == -1){
            if(b / 2 != a / 2)
                return 1;
        }
            
        for (int i = 0; i < n; i++) {
            a = (a % 2 == 1) ? (a+1)/2 : a/2;
            b = (b % 2 == 1) ? (b+1)/2 : b/2;
            if(a - b == 1 || a - b == -1){
                if(((a % 2 == 1) ? (a+1)/2 : a/2) == ((b % 2 == 1) ? (b+1)/2 : b/2))
                    return i + 2;
            }
        }
        
        return answer;
    }
}