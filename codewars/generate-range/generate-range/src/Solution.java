public class Solution {
    public static int[] generateRange(int min, int max, int step) {
        int[] array = new int[Math.abs(max - min) / step + 1];
        int index = 0;
        for (int i = min; i <= max; i+= step) {
            array[index] = i;
            index++;
        }
        return array;
  }
}
