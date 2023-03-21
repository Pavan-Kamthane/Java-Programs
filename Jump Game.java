public class jump_game {
    public static void main(String[] args){
        int[] nums ={2,3,1,1,4};
        System.out.println(canJump(nums));;
    }
    public static boolean canJump(int[] nums) {
        int reach =0;
        for(int i = 0; i<= reach ;i++){
            reach = Math.max(reach,i + nums[i]);
            if(reach >= nums.length -1){
                return true;
            }
        }
        return false;
    }
}
