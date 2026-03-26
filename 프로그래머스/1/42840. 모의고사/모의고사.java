import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 학생별 패턴
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 맞힌거 개수
        int score1 = 0, score2 = 0, score3 = 0;
        
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == p1[i % p1.length]) score1++;
            if(answers[i] == p2[i % p2.length]) score2++;
            if(answers[i] == p3[i % p3.length]) score3++;
        }
        
        // 제일 높은 점수를 찾고
        // 그점수랑 같은 사람 찾기
        int maxScore = score1;
        if (score2 > maxScore) {
            maxScore = score2;
        }
        if (score3 > maxScore) {
            maxScore = score3;
        }
        
        List<Integer> list = new ArrayList<>();
        if (maxScore == score1 ) list.add(1);
        if (maxScore == score2 ) list.add(2);
        if (maxScore == score3 ) list.add(3);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); 
        }
        
        return answer;
        
    }
}