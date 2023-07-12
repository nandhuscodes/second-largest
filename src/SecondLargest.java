import java.util.Scanner;

public class SecondLargest {
    static int findSecondLargest(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        int s = -1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == A[A.length - 1]) {
                continue;
            } else {
                s = A[i];
                break;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(findSecondLargest(array));
    }
}
