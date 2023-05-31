public class DiceCount {

    // without DP
    static int countWays(int currentValue, int endValue) {
        // Positive base case
        if(currentValue == endValue) {
            return 1;
        }
        // Negative base case
        if(currentValue > endValue) {
            return 0;
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWays(currentValue + dice, endValue);
        }
        return count;
    }

    static int counter = 0;
    // with DP Memoization
    static int countWaysMemo(int currentValue, int endValue, int cache[]) {
        counter++;
        // Positive base case
        if(currentValue == endValue) {
            return 1;
        }
        // Negative base case
        if(currentValue > endValue) {
            return 0;
        }
        if(cache[currentValue] != 0) {
            return cache[currentValue];
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            count = count + countWaysMemo(currentValue + dice, endValue, cache);
        }
        cache[currentValue] = count;
        return count;
    }

    static int tabulation(int start, int end) {
        int cache[] = new int[end+1];
        cache[end] = 1;
        for(int i = end-1; i >= 0; i--) {
            int count = 0;
            for(int dice = 1; dice <= 6 && dice + i < cache.length; dice++) {
                count += cache[dice + i];
            }
            cache[i] = count;
        }
        return cache[start];
    }

    public static void main(String[] args) {
        int target = 10;
        int cache[] = new int[target+1];
        int res = countWaysMemo(0, target, cache);
        System.out.println("Result : " + res);
        System.out.println("Counter : " + counter);
    }
}
