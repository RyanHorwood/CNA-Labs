import java.util.Arrays;

public class QuickSortDataset {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Emily",
            "Frank", "George", "Hannah", "Isaac", "Jack", "Kate", "Lucy", "Mike",
            "Nancy", "Oliver", "Peter", "Queenie", "Ryan", "Sarah", "Tom", "Uma",
            "Vera", "Wendy", "Xander", "Yara", "Zoe", "Aaron", "Brianna", "Chloe",
            "Daniel", "Eva", "Felix", "Gina", "Helen", "Ivy", "Jacob", "Katie",
            "Liam", "Megan", "Nina", "Oscar", "Patrick", "Quinn", "Riley",
            "Samantha", "Tyler", "Violet", "William", "Xavier", "Yasmine", "Zack",
            "Adam", "Benjamin", "Caroline", "Dylan", "Ethan", "Freya", "Grace",
            "Henry", "Isla", "Jessica", "Kevin", "Lily", "Mia", "Noah", "Olivia",
            "Penelope", "Quentin", "Rebecca", "Sophia", "Taylor", "Victoria",
            "Wyatt", "Xin", "Yolanda", "Zara" };
        int[] scores = { 75, 92, 80, 63, 88, 71, 96, 83, 68, 82, 77, 90,
            69, 94, 85, 73, 78, 87, 91, 65, 89, 84, 76, 70, 81, 72, 93, 79, 67, 86,
            62, 99, 60, 97, 57, 95, 59, 98, 58, 66, 61, 74, 55, 56, 54, 53, 52, 51,
            50, 49, 95, 98, 88, 74, 85, 67, 72, 81, 79, 94, 73, 90, 61, 77, 83, 99,
            76, 87, 56, 66, 59, 63, 69, 80, 89, 62, 96, 55, 97, 92, 71, 50, 57, 78,
            91, 84, 53, 86, 51, 58, 64, 82, 65, 70, 93, 54 };
        int n = names.length;
        long startTime = System.nanoTime();
        // Run the sorting algorithm 100000 times
        for (int k = 0; k < 100000; k++) {
            quickSort(scores, names, 0, n - 1);
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        double averageTime = (double) totalTime / 1000;
        // Print the sorted dataset
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }
        System.out.println("Total # of players: " + n); 
        System.out.println("Average sorting time: " + averageTime + " microseconds"); 
        
    }
    
    public static void quickSort(int[] arr, String[] names, int left, int right) {
    if (left < right) {
        int pivotIndex = partition(arr, names, left, right);
        quickSort(arr, names, left, pivotIndex - 1);
        quickSort(arr, names, pivotIndex + 1, right);
    }
        
    }
    
    public static int partition(int[] arr, String[] names, int left, int right) {
    int pivotValue = arr[right];
    int i = left - 1;
    for (int j = left; j < right; j++) {
        if (arr[j] < pivotValue) {
            i++;
            swap(arr, i, j);
            swap(names, i, j);
        }
    }
    swap(arr, i + 1, right);
    swap(names, i + 1, right);
    return i + 1;
        
    }
    
    public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
        
    }
    
    public static void swap(String[] arr, int i, int j) {
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
        
    }
}