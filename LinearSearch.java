import java.util.Scanner;

public class LinearSearch {

    // Method to perform linear search
    public static int search(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;  // return index if found
            }
        }
        return -1;  // return -1 if not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int length = scanner.nextInt();

        int[] list = new int[length];
        System.out.println("Enter the elements:");
        for (int i = 0; i < length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();

        int index = search(list, target);

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + index);
        }
        scanner.close();
    }
}
