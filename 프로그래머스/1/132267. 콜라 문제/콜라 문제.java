class Solution {
    public int solution(int a, int b, int n) {
        int totalCola = 0; // 받은 콜라 갯수
        int myCola = n; // 처음에 가진 빈병 콜라 갯수
        
        while(myCola >= a){ // 가지고있는 빈병 콜라가 a(필요갯수)보다 작으면 종료
            int newCola = (myCola / a) * b; 
            int leftCola =  myCola % a;
            
            totalCola += newCola;
            myCola = newCola + leftCola;
            
        }
        return totalCola;
    }
}