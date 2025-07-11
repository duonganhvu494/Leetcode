class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] sangnt = new boolean[right + 1];
        Arrays.fill(sangnt, true);
        sangnt[0] = sangnt[1] = false;
        for (int i = 2; i * i <= right; i++) {
            if (sangnt[i]) {
                for (int j = i * i; j <= right; j += i) {
                    sangnt[j] = false;
                }
            }
        }

        List<Integer> a = new ArrayList<>(); 
        for (int i=left; i<=right; i++){
            if (sangnt[i])
                a.add(i);
        }

        int minDiff = Integer.MAX_VALUE;
        int[] result = {-1, -1};

        for (int i = 1; i < a.size(); i++) {
            int diff = a.get(i) - a.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = a.get(i - 1);
                result[1] = a.get(i);
            }
        }

        return result;
    }
}