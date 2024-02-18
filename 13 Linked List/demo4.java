// import java.util.Scanner;

//  class Solution {

//     public static int isSameReflection(String word1, String word2) {
//         if(word1.length() != word2.length()) {
//             return -1; // Words have different lengths, not same reflection
//         }
        
//         String concatenatedWord = word1 + word2;

//         // Check if word2 is a substring of the concatenatedWord
//         if(concatenatedWord.contains(word2)) {
//             return 1; // word2 is a same reflection of word1
//         } else {
//             return -1; // Not same reflection
//         }
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         // Input for word1
//         String word1 = in.nextLine();

//         // Input for word2
//         String word2 = in.nextLine();

//         int result = isSameReflection(word1, word2);
//         System.out.println(result);

//         in.close();
//     }
// }

import java.util.*;

 class GasStations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int[] dis = new int[num];
        
        for (int i = 0; i < num; i++) {
            dis[i] = scanner.nextInt();
        }

        int numS = scanner.nextInt();
        int[] IGas = new int[num];

        for (int i = 0; i < num; i++) {
            IGas[i] = scanner.nextInt();
        }

        scanner.close();

        int distance = scanner.nextInt();
        int initialGas = scanner.nextInt();
        
        int minStops = minGasStations(num, dis, numS, IGas, distance, initialGas);
        System.out.println(minStops);
    }
    
    public static int minGasStations(int num, int[] dis, int numS, int[] IGas, int distance, int initialGas) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int stops = 0;
        int currentDistance = initialGas;
        
        for (int i = 0; i < num; i++) {
            int stationDistance = dis[i];
            int gasAvailable = IGas[i];
            
            currentDistance -= stationDistance - (i > 0 ? dis[i - 1] : 0);
            
            while (!maxHeap.isEmpty() && currentDistance < 0) {
                currentDistance += maxHeap.poll();
                stops++;
            }
            
            if (currentDistance < 0) {
                return -1;
            }
            
            maxHeap.offer(gasAvailable);
        }
        
        while (!maxHeap.isEmpty() && currentDistance < distance) {
            currentDistance += maxHeap.poll();
            stops++;
        }
        
        if (currentDistance < distance) {
            return -1;
        }
        
        return stops;
    }
}
