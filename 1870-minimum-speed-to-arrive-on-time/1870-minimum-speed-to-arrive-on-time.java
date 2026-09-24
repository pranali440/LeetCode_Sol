class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        long H = Math.round(hour * 100);   // hour in hundredths, exact integer
        int n = dist.length;

        int lo = 1, hi = 10_000_000, ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canArrive(dist, mid, H)) {
                ans = mid;
                hi = mid - 1;      // try a smaller speed
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private boolean canArrive(int[] dist, int speed, long H) {
        int n = dist.length;
        long full = 0;                               // whole hours for trains 0..n-2
        for (int i = 0; i < n - 1; i++) {
            full += (dist[i] + speed - 1) / speed;   // ceil(dist[i] / speed)
        }

        long remaining = H - 100 * full;             // hundredths left for the last train
        if (remaining <= 0) return false;

        // 100 * dist[n-1] / speed <= remaining, rearranged to avoid division
        return 100L * dist[n - 1] <= remaining * speed;
    }
}