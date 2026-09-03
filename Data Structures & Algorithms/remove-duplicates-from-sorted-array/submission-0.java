class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new LinkedHashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        int k = 0;
        for (int num : s) {
            nums[k] = num;
            k++;
        }
        return k;
    }
}