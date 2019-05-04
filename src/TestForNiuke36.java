//统计一个数字在排序数组中出现的次数。
public class TestForNiuke36 {

    public static int GetNumberOfK(int[] array, int k) {
        if (null == array || array.length == 0||array[array.length-1]<k)
            return 0;
        int i = 0;
        while (array[i] < k) {
            i++;
        }
        int count=0;
        while (i<array.length-1&&array[i]==k){
            count++;
            i++;
        }
        if(array[i]==k)
            count++;
        return count;
    }

    public static void main(String[] args) {
        int []array={1,2,3,3,3,3};
        System.out.println(GetNumberOfK(array,3));
    }
}
