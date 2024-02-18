import java.util.*;

 class Solution {

    public static int minGasStations(int[] disList, int[] IGasList, int distance, int initialGas) {
        int answer = 0;
        int currentGas = initialGas;
        PriorityQueue<Integer> gasQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < disList.length; i++) {
            int distanceToNextStation = (i < disList.length - 1) ? disList[i + 1] - disList[i] : distance - disList[i];

            while (!gasQueue.isEmpty() && currentGas < distanceToNextStation) {
                currentGas += gasQueue.poll(); // Use the maximum available gasoline
                answer++;
            }

            if (currentGas < distanceToNextStation) {
                return -1; // Not enough gasoline to reach the destination
            }

            currentGas -= distanceToNextStation;
            gasQueue.offer(IGasList[i]); // Add available gasoline to the queue
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for disList
        int disListSize = in.nextInt();
        int[] disList = new int[disListSize];
        for (int idx = 0; idx < disListSize; idx++) {
            disList[idx] = in.nextInt();
        }

        // Input for IGasList
        int IGasListSize = in.nextInt();
        int[] IGasList = new int[IGasListSize];
        for (int idx = 0; idx < IGasListSize; idx++) {
            IGasList[idx] = in.nextInt();
        }

        int distance = in.nextInt();
        int initialGas = in.nextInt();

        int result = minGasStations(disList, IGasList, distance, initialGas);
        System.out.print(result);

        in.close();
    }
}
