/**
 * 给一个数组，返回它的最大连续子序列的和
 */
public class TestForNiuke29 {
    public int FindGreatestSumOfSubArray(int[] array) {

        int num=array[0];
        int mid;
        for(int i=0;i<array.length;i++){
            mid=0;
            for(int j=i;j<array.length;j++){
                mid=mid+array[j];
                if(mid>num)
                    num=mid;
            }
        }
        return num;
    }
}
