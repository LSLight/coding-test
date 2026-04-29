class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] speaks = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling){
            if(word.contains("ayaaya") || word.contains("yeye") || 
                word.contains("woowoo") || word.contains("mama")) {
                continue;
            }
            for (String speak : speaks){
                word = word.replace(speak," ");
            }
            if (word.replace(" ", "").length() == 0){
                answer++;
            }
            
        }
        
        return answer;
    }
}