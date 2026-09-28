class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> st = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }

        int index = 0;

        for (int it : st) {
            nums[index] = it;
            index++;
        }

        return index;
    }
}