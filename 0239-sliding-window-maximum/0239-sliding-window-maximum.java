class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i > k - 1) {
                ans[j] = dq.peekFirst();
                // to remove
                if (nums[j] == dq.peekFirst()) {
                    dq.pollFirst();
                }
                j++;
            }
            // to add
            if (dq.isEmpty() || dq.peekLast() > nums[i])
                dq.offer(nums[i]);
            else {
                while (!dq.isEmpty() && dq.peekLast() < nums[i]) {
                    dq.pollLast();
                }
                dq.offer(nums[i]);
            }
        }
        ans[n - k] = dq.peekFirst();

        return ans;
    }
}