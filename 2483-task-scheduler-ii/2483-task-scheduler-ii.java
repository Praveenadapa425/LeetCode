class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        Map<Integer, Long> lastDone = new HashMap<>();
        long day = 0;

        for (int task : tasks) {
            day++; //adding the daysa
            if (lastDone.containsKey(task)) {
                long prevDay = lastDone.get(task);
                if (day <= prevDay + space) {
                    day = prevDay + space + 1; 
                }
            }
            lastDone.put(task, day);
        }

        return day;
    }
}