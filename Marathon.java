public class Marathon {
    public static void main(String[] args) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };
        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        int idx = lowestTime(times);
        System.out.println("Fastest runner is " + names[idx] + " with a time of " + times[idx]);
        System.out.println("second fastest runner has a time of " + secondBestTime(times));
    }

    public static int lowestTime(int[] times) {
        if (times.length == 0) {
            throw new RuntimeException("Empty array");
        }

        int fastestTime = times[0];
        int fastestIdx = 0;
        for (int i = 1; i < times.length; i++) {
            if (fastestTime > times[i]) {
                fastestTime = times[i];
                fastestIdx = i;
            }
        }

        return fastestIdx;
    }

    public static int secondBestTime(int[] times) {
        if (times.length < 2) {
            throw new RuntimeException("not long enough");
        }
        int fastestRunner = lowestTime(times);
        int secondFastestRunner = Integer.MAX_VALUE;
        for (int time : times) {
            if (time > times[fastestRunner] && time < secondFastestRunner) {
                secondFastestRunner = time;
            }
        }
        return secondFastestRunner;
    }
}
