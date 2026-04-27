class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = wallpaper.length, minY = wallpaper[0].length();
        int maxX = 0, maxY = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    // 시작점
                    if (j < minY) minY = j;
                    if (i < minX) minX = i;
                    //끝점
                    if (i + 1 > maxX) maxX = i + 1;
                    if (j + 1 > maxY) maxY = j + 1;
                }
            }
        }
        int[] answer = {minX, minY, maxX, maxY};

        return answer;
    }
}