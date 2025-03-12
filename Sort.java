import java.util.Scanner;

public class Sort {

    static void before(int[] arr) {
        System.out.println("Before: ");
        for(int num : arr)
            {
                System.out.print(num + " ");
        }
    }

    static void after(int[] arr){
        System.out.println("");
        System.out.println("After: ");
        for(int num : arr)
            {
                System.out.print(num + " ");
            }
        System.out.println(" ");
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++) {
                if(arr[j] > arr[j + 1]){
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        int minIdx = -1;
        for(int i = 0; i < n - 1; i++){
            minIdx = i;
            for(int j = i + 1; j < n; j++){
                    if(arr[minIdx] > arr[j]){
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
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
                int part = partition(arr, low, high);
                quickSort(arr, low, part - 1);
                quickSort(arr, part + 1, high );
        }
    }

        private static int partition(int[] arr, int low, int high)
            {
                int pivot = arr[high];
                int i = low - 1;
                for(int j = low; j <= high; j++)
                    {
                        if(arr[j] < pivot)
                            {
                                i++;
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                    }
                int temp = arr[i + 1];
                arr[i + 1] = arr[high];
                arr[high] = temp;
                return i + 1;
            }

        static void mergeSort(int arr[], int l, int r)
            {
                //do merge sort
                if(l < r)
                    {
                        int mid = (l + r) / 2;
                        mergeSort(arr, l, mid);
                        mergeSort(arr, mid + 1, r);

                        merge(arr, l, mid, r);
                    }
            }

        static void merge(int[] arr, int l, int mid, int r) 
            {

                int n1 = mid - l + 1;
                int n2 = r - mid;
                int lArr[] = new int[n1];
                int rArr[] = new int[n2];

                for(int i = 0; i < n1; i++ )
                    {
                        lArr[i] = arr[l+i];
                    }
                for(int i = 0; i < n2; i++ )
                    {
                        rArr[i] = arr[mid + 1 + i];
                    }
                int i = 0;
                int j = 0;
                int k = l;

                while(i < n1 && j < n2) 
                    {
                        if(lArr[i] <= rArr[j])
                            {
                                arr[k] = lArr[i];
                                i++;
                            }
                        else
                            {
                                arr[k] = rArr[j];
                                j++;
                            }
                        k++;
                    }

                while(i < n1) 
                    {
                        arr[k] = lArr[i];
                        i++;
                        k++;
                    }
                while(j < n2)
                    {
                        arr[k] = rArr[j];
                        j++;
                        k++;
                    }
            }

        public static void main(String[] args) 
            {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("1: Bubble, 2: Selection, 3: Insertion, 4: Quick, 5: Merge Sort");
            System.out.print("Enter Sort Choice: ");
            int selection = input.nextInt();
            System.out.println(" ");
            
            int arr[] = {3, 5, 1, 4, 6 ,2};
            
            // if(selection == 1)
            //     {
            //         System.out.println("Bubble Sort");
            //         before(arr);
            //         System.out.println("");
            //         bubbleSort(arr);
            //         after(arr);
            //     }
            // else if(selection == 2)
            //     {
            //         System.out.println("Selection Sort");
            //         before(arr);
            //         System.out.println("");
            //         selectionSort(arr);
            //         after(arr);
            //     }
            // else if(selection == 3)
            //     {
            //         System.out.println("Insertion Sort");
            //         before(arr);
            //         System.out.println("");
            //         insertionSort(arr);
            //         after(arr);
            //     }
            // else if(selection == 4)
            //     {
            //         System.out.println("Quick Sort");
            //         before(arr);
            //         System.out.println("");
            //         quickSort(arr, 0, arr.length -1);
            //         after(arr);
            //     }
            // else if(selection == 5)
            //     {
            //         System.out.println("Insertion Sort");
            //         before(arr);
            //         System.out.println("");
            //         mergeSort(arr);
            //         after(arr);
            //     }
            // else
            //     {
            //         System.out.println("Enter a valid choice");
            //     }

            switch(selection){
                case 1 -> {
                    System.out.println("Bubble Sort");
                    before(arr);
                    System.out.println("");
                    bubbleSort(arr);
                    after(arr);
                }
                case 2 -> {
                    System.out.println("Selection Sort");
                    before(arr);
                    System.out.println("");
                    selectionSort(arr);
                    after(arr);
                }
                case 3 -> {
                    System.out.println("Insertion Sort");
                    before(arr);
                    System.out.println("");
                    insertionSort(arr);
                    after(arr);
                }
                case 4 -> {
                    System.out.println("Quick Sort");
                    before(arr);
                    System.out.println("");
                    quickSort(arr, 0, arr.length -1);
                    after(arr);
                }
                case 5 -> {
                    System.out.println("Merge Sort");
                    before(arr);
                    System.out.println("");
                    mergeSort(arr, 0, arr.length - 1);
                    after(arr);
                }
                default -> System.out.println("Enter a valid choice");
            }
        }
        }
    }
