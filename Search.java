public class Search {
    

    public static void main(String[] args)
        {
            int arr[] = {5, 7, 9, 11, 13, 45, 32, 21};
            int target = 32;

            int linResult = linearSearch(arr, target);
            int binResult = binarySearch(arr, target);
            // int binResult = binarySearch(arr, target, 0, arr.length - 1); //for recursion

            if(linResult != -1)
                {
                    System.out.println("Linear search element found at index: " + linResult);
                }
            if(binResult != -1)
                {
                    System.out.println("Binary search element found at index: " + binResult);
                }
            else
                {
                    System.out.println("Element not found");
                }
        }
    public static int linearSearch(int[] arr, int target)
        {
            int step = 0;
            for(int i = 0; i < arr.length; i++)
                {
                    step++;
                    if(arr[i] == target)
                        {
                            System.out.println("Linear steps taken: " + step);
                            return i;
                        }
                }
            System.out.println("Linear steps taken: " + step);
            return -1;
        }
    // public static int binarySearch(int[] arr, int target, int left, int right) //for recursion
    public static int binarySearch(int[] arr, int target)
        {
            int left = 0;
            int right = arr.length;
            int step = 0;

            // if(left <= right) { //recursion
            //     int mid = (left + right) / 2;
            //     if(arr[mid] == target)
            //         return mid;
            //     else if (arr[mid] < target) 
            //         return binarySearch(arr, target, mid + 1, right);
            //     else
            //         return binarySearch(arr, target, left, mid - 1);
            // }

            while(left <= right)
            {
                step++;
                int mid = (left + right) / 2;
                if(arr[mid] == target)
                    {
                        System.out.println("Binary steps taken: " + step);
                        return mid;
                    }
                else if(arr[mid] < target)
                    {
                        left = mid + 1;
                    }
                else
                    {
                        right = mid - 1;
                    }
            }
            System.out.println("Binary steps taken: " + step);
            return -1;
        }
    }
