public class SumArray {
    public static void main(String[] args) {
        int nums[] = {1, 3, 7, 2, -11, 12};
  
        int sum = 0;
        for (int num : nums) {
           sum += num;
        }
  
        System.out.printf("The sum is %d\n", sum);
     } 
  
     public static int[] toPower(int size, int power) {
        int result[] = new int[size];
  
        for (int i = 0; i < size; i++) {
           result[i] = (int) Math.pow(i, power);
        }
  
        return result;
     }
  }