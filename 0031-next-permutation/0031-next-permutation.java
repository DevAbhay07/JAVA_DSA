class Solution {

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int index = -1;

        // Step 1: Find the breakpoint
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse entire array
        if (index == -1) {
            rev(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the element just greater than nums[index]
        for (int i = n - 1; i > index; i--) {

            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 4: Reverse the part after breakpoint
        rev(nums, index + 1, n - 1);
    }


    public void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public void rev(int[] nums, int start, int end) {

        while (start < end) {

            swap(nums, start, end);

            start++;
            end--;
        }
    }
}