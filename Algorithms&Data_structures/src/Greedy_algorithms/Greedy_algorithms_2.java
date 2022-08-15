package Greedy_algorithms;

public class Greedy_algorithms_2 {
    public static void main(String[] args) {
        int capacity = 400;
        int[] stations = {0, 200, 375, 550, 750, 950};

        int got = minStops(stations, capacity);
        System.out.println(got);
    }

    private static int minStops(int[] stations, int capacity) {
        int result = 0;
        int currentStop = 0;
        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;
            while (nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;
            if (currentStop == nextStop) return -1;
            if (nextStop < stations.length - 1) result++;
            currentStop = nextStop;
        }
        return result;
    }
}
