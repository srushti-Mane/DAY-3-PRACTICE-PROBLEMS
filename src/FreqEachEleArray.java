public class FreqEachEleArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,29,9,89,99,99,89};
        int size = arr.length;
        countFrequency(arr, size);
    }

    static void countFrequency(int[] array, int size) {
        for (int s = 0; s < size; s++) {
            int flag = 0;
            int count = 0;
            for (int r = s + 1; r < size; r++) {
                if (array[s] == array[r]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                continue;
            for (int r = 0; r <= s; r++) {
                if (array[s] == array[r])
                    count++;
            }
            System.out.println(array[s] + ": " + count);
        }
    }
}