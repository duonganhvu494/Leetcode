class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        
        long res = 0;
        for (int i=0; i <= total/cost1; i++){
            long x = total - i*cost1;
            res+=(x/cost2)+1;
        }
        return res;
    }
}