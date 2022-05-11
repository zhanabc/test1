package likou;

public class one {
    public boolean containsDuplicate(int[] nums) {
        int s;
        for(int i=0;i<nums.length;i++){
            s=nums[i];
            for(int j=(i+1);j<nums.length;j++){
                if(s==nums[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        one one = new one();
        boolean b = one.containsDuplicate(nums);
        System.out.println(b);
    }
}
