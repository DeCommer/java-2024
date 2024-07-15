import java.util.Scanner;

public class Sort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int minIdx = -1;

        for(int i = 0; i < n - 1; i++) {
            minIdx = i;
            for(int j = i + 1; j < n; j++) {
                
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    static void quickSort(int[] arr) {
        //code
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1: Bubble, 2: Selection, 3: Insertion, 4: Quick/Merge");
        System.out.println("Enter Sort Choice:");
        int selection = input.nextInt();

        int arr[] = {6, 5, 2, 8, 9 ,4};

        System.out.println("Before: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        
        if(selection == 1) {
            System.out.println("");
            System.out.println("Bubble Sort");
            bubbleSort(arr);
        }else if(selection == 2) {
            System.out.println("");
            System.out.println("Selection Sort");
            selectionSort(arr);
        }else if(selection == 3) {
            System.out.println("");
            System.out.println("Insertion Sort");
            insertionSort(arr);
        }else if(selection == 4) {
            quickSort(arr);
        }
        
        else {
            System.out.println("Enter a valid choice");
        }

        System.out.println("");
        System.out.println("After: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        input.close();
    }
}
