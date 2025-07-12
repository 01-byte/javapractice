public class TwoSumActivity {

    public static void main(String[] args) {
        int target = 15;  

        int[] nums = {1, 4, 11, 15};  
        int[] result = twoSum(target, nums);

        
        if (result != null) {
            System.out.println("Target is  " + result[0] + ", " + result[1]);
        } else {
            System.out.println("target not found ");
        }
    }

    public static int[] twoSum(int target, int... sum) {
        for (int i = 0; i < sum.length; i++) {
            for (int j = i + 1; j < sum.length; j++) { 
                if (sum[i] + sum[j] == target) {
                    return new int[] {i, j};  
                }
            }
        }
        return null;  
    }
}
