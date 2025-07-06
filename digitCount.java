class Solution {
    public boolean digitCount(String num) {
        int[] a = new int[10];
        for (char c : num.toCharArray()){
            a[c-'0']++;
        }

        for (int i = 0; i < num.length(); i++) {
            int count = num.charAt(i) - '0';
            if (a[i] != count) return false;
        }

        return true;
    }
}