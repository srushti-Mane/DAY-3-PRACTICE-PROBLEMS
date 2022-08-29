public class DuplicateEleArray {
    public static void main(String[] args) {

        int [] arr = new int [] {10,20,33,33,55,89,99,99,9,9};

        System.out.println("Duplicate elements in given array: ");
        for(int s = 0; s < arr.length; s++) {
            for(int t = s + 1; t < arr.length; t++) {
                if(arr[s] == arr[t])
                    System.out.println(arr[t]);
            }
        }
    }
}

