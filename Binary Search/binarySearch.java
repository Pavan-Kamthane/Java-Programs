// Program to find an element in an array using Iterative Binary Search.

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 5;
        System.out.println(search(nums,target));
    }

    private static int search(int[] nums, int target){
        int s=0;
        int e=nums.length-1;
        
        while(s<=e){
            int mid = s+(e-s)/2;
	    if(nums[mid] == target){
	    	return mid;
            else if(nums[mid]<target){
                s=mid+1;
            } else {
                e=mid-1;
            }
        }
        return -1;
    }
}
