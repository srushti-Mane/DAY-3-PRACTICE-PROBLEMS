public class SecondLargest {
        public static void main(String args[]) {
            int temp, size;
            int arr[] = {12, 13, 1, 10, 34, 10};
            size = arr.length;
            for (int i=0; i< size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.print("second largest= " +arr[size-2]);
        }
    }




