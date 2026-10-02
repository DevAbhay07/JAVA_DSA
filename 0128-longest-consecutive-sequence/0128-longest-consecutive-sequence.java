class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();

        for(int value:nums){
            values.add(value);

        }

        int longest = 0;

        for(int value:values){
            if(values.contains(value - 1)){
                continue;
            }
            int curlength = 1;
            int nextvalue = value +1;

            while(values.contains(nextvalue)){
                curlength ++;
                nextvalue ++;
            }
            longest = Math.max(longest,curlength);
        }
        return longest;
    }
}