class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2){
        int ax1 = rec1[0];
        int ay1 = rec1[1];
        int ax2 = rec1[2];
        int ay2 = rec1[3];

        int bx1 = rec2[0];
        int by1 = rec2[1];
        int bx2 = rec2[2];
        int by2 = rec2[3];
        if(ax2 <= bx1 || bx2 <= ax1 || ay2 <= by1 || by2 <= ay1){
            return false;
        }
        return true;
    }
}