public class matrixBinarySearch {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 23;
        System.out.println(search2d(mat,target));
    }

    private static boolean search2d(int[][] mat, int target) {
        int start = 0;
        int end = mat.length-1;
        int mid;
        int targetRow = 0;

        // searching for the target row using the binary search
        while(start<=end){
            mid = start + (end-start)/2;
            if(mat[mid][0]<=target && mat[mid][mat[mid].length-1]>=target){
                targetRow=mid;
                break;
            }else if(mat[mid][0]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        // searching in the target row using the binary search
        int midStart = 0;
        int midEnd = mat[targetRow].length-1;
        int midMid;

        while(midStart<=midEnd){
            midMid = midStart+(midEnd-midStart)/2;
            if(mat[targetRow][midMid] == target){
                return true;
            }else if(mat[targetRow][midMid]>target){
                midEnd=midMid-1;
            }else{
                midStart=midMid+1;
            }
        }
        return false;
    }
}
