/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class TestForNiuke34 {
    public int InversePairs(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = count + nixu(i, array[i], array);
        }
        count=count%1000000007;
        return count;
    }

    //求某个数的逆序对
    public int nixu(int i, int num, int[] array) {
        int count = 0;

        for (int j = i; j < array.length; j++) {
            if (num > array[j])
                count++;
        }
        return count;
    }


}
