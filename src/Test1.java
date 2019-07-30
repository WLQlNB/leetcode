public class Test1 {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为目标值的那 两个 整数，
     * 并返回他们的数组下标。
     */
    public static int[] twoSum(int[] nums, int target) {
        int []b=new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j = i+1; j <nums.length ; j++) {
                if(target==nums[i]+nums[j]){
                    b[0]=i;
                    b[1]=j;
                }
            }
        }
      return b;
    }

    public static void main(String[] args) {
        int a[]={2,7,11,15};
        int b[]= twoSum(a,9);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
