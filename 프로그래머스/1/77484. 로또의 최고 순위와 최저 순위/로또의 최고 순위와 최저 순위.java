class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zeroCount = 0;
        int winCount = 0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zeroCount++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    winCount++;
                    break;
                } 
            }
                
        }
        // 0,1은 6등,2는 5등..
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        answer[0] = rank[zeroCount+winCount];
        answer[1] = rank[winCount];
        
        return answer;
    }
}