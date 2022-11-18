public class task4{
    public static void main(String[] args) {
        int[] steps = new int[nums.length];
        int sum = 0;
        int min;
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                sum = Math.abs(nums[i] - nums[j]) + sum;
            }
            steps[i] = sum;
            sum = 0;
        }
        min = steps[0];
        for(int i = 1; i < steps.length; i++){
            if(steps[i] < min){
                min = steps[i];
            }
        }
        System.out.println(min);
    }
}
