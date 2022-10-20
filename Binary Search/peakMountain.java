public class peakMountain {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakMountainIndex(arr));

    }
    
    private static int peakMountainIndex(int[] nums){
        int peak=0;
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            System.out.println("Start:" + start + " End:" + end);
            int mid = start + (end-start)/2;

            System.out.println("Mid:"+mid);

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
                peak = mid;
                return peak;
            }else if(nums[mid]<nums[mid+1]){
                start = mid;
            } else{
                end = mid;
            }

        }
        return -1;
    }
}
